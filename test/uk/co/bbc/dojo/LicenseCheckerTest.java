package uk.co.bbc.dojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LicenseCheckerTest {

    private MediaFactory factory = new MediaFactory();

    private LicenseChecker underTest = new LicenseChecker();

    @Test
    public void shouldTreatSimpleWith4VideoCharactersOrLessAsLicenseFree() {
        Media simple =  factory.create("simple","AUDIO","vide");

        boolean needsLicense = underTest.needsLicense(simple);

        assertThat(needsLicense,is(false));
    }

    @Test
    public void shouldTreatSimpleWith5VideoCharactersOrMoreAsLicensed() {
        Media simple =  factory.create("simple","AUDIO","video");

        boolean needsLicense = underTest.needsLicense(simple);

        assertThat(needsLicense,is(true));
    }

    @Test
    public void shouldTreatAdvancedAudioAsLicensed() {
        Media advancedAudio =  factory.create("advancedAudio","AUDIO","video");

        boolean needsLicense = underTest.needsLicense(advancedAudio);

        assertThat(needsLicense,is(true));
    }

    @Test
    public void shouldTreatAdvancedVideoAsLicensed() {
        Media advancedVideo =  factory.create("advancedVideo","AUDIO","video");

        boolean needsLicense = underTest.needsLicense(advancedVideo);

        assertThat(needsLicense,is(true));
    }

    @Test
    public void shouldTreatAdvancedBothAsLicensed() {
        Media advancedBoth =  factory.create("advancedBoth","AUDIO","video");

        boolean needsLicense = underTest.needsLicense(advancedBoth);

        assertThat(needsLicense,is(true));
    }

}
