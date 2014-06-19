<?php

use \bbc\polymorphism\dojo\MediaFactory;
use \bbc\polymorphism\dojo\Decoder;

class DecoderTest extends \PHPUnit_Framework_TestCase
{

    private $factory;

    private $underTest;

    public function __construct()
    {
        $this->factory = new MediaFactory;
        $this->underTest = new Decoder;
    }

    /** @test */
    public function shouldDecodeSimpleAudioByLowerCase()
    {
        $media =$this->factory->create("simple", "AUDIO", "video");

        $decodedAudio =$this->underTest->decodeAudio($media);

        $this->assertEquals($decodedAudio, "audio");
    }

    /** @test */
    public function shouldDecodeSimpleVideoByUpperCase()
    {
        $media =$this->factory->create("simple", "AUDIO", "video");

        $decodedAudio =$this->underTest->decodeVideo($media);

        $this->assertEquals($decodedAudio, "VIDEO");
    }

    /** @test */
    public function shouldDecodeAdvancedAudioByExpandingAndLowerCase()
    {
        $media =$this->factory->create("advancedAudio", "AUDIO", "video");

        $decodedAudio =$this->underTest->decodeAudio($media);

        $this->assertEquals($decodedAudio, "aauuddiioo");
    }

    /** @test */
    public function shouldDecodeVideoFromAdvancedAudioNormally()
    {
        $media =$this->factory->create("advancedAudio", "AUDIO", "video");

        $decodedAudio =$this->underTest->decodeVideo($media);

        $this->assertEquals($decodedAudio, "VIDEO");
    }


    /** @test */
    public function shouldDecodeVideoFromAdvancedBothByUpperCaseEveryOtherLetter()
    {
        $media =$this->factory->create("advancedBoth", "AUDIO", "video");

        $decodedAudio =$this->underTest->decodeVideo($media);

        $this->assertEquals($decodedAudio, "ViDeO");
    }

    /** @test */
    public function shouldDecodeAudioFromAdvancedBothByExpandAndLowerCase()
    {
        $media =$this->factory->create("advancedBoth", "AUDIO", "video");

        $decodedAudio =$this->underTest->decodeAudio($media);

        $this->assertEquals($decodedAudio, "aauuddiioo");
    }

    /** @test */
    public function shouldDecodeAdvancedVideoByUpperCaseEveryOtherLetter()
    {
        $media =$this->factory->create("advancedVideo", "AUDIO", "video");

        $decodedAudio =$this->underTest->decodeVideo($media);

        $this->assertEquals($decodedAudio, "ViDeO");
    }

    /** @test */
    public function shouldDecodeAudioFromAdvancedVideoNormally()
    {
        $media =$this->factory->create("advancedVideo", "AUDIO", "video");

        $decodedAudio =$this->underTest->decodeAudio($media);

        $this->assertEquals($decodedAudio, "audio");
    }
}
