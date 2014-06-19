<?php

namespace bbc\polymorphism\dojo\test;

use bbc\polymorphism\dojo\MediaFactory;
use bbc\polymorphism\dojo\LicenseChecker;

class LicenseCheckerTest extends \PHPUnit_Framework_TestCase
{
    private $factory;

    private $underTest;

    public function __construct()
    {
        $this->factory = new MediaFactory;
        $this->underTest = new LicenseChecker;
    }

    /** @test * */
    public function shouldTreatSimpleWith4VideoCharactersOrLessAsLicenseFree()
    {
        $simple = $this->factory->create("simple", "AUDIO", "vide");

        $needsLicense = $this->underTest->needsLicense($simple);

        $this->assertFalse($needsLicense);
    }

    /** @test * */
    public function shouldTreatSimpleWith5VideoCharactersOrMoreAsLicensed()
    {
        $simple = $this->factory->create("simple", "AUDIO", "video");

        $needsLicense = $this->underTest->needsLicense($simple);

        $this->assertTrue($needsLicense);
    }

    /** @test * */
    public function shouldTreatAdvancedAudioAsLicensed()
    {
        $advancedAudio = $this->factory->create("advancedAudio", "AUDIO", "video");

        $needsLicense = $this->underTest->needsLicense($advancedAudio);

        $this->assertTrue($needsLicense);
    }

    /** @test * */
    public function shouldTreatAdvancedVideoAsLicensed()
    {
        $advancedVideo = $this->factory->create("advancedVideo", "AUDIO", "video");

        $needsLicense = $this->underTest->needsLicense($advancedVideo);

        $this->assertTrue($needsLicense);
    }

    /** @test * */
    public function shouldTreatAdvancedBothAsLicensed()
    {
        $advancedBoth = $this->factory->create("advancedBoth", "AUDIO", "video");

        $needsLicense = $this->underTest->needsLicense($advancedBoth);

        $this->assertTrue($needsLicense);
    }
}
