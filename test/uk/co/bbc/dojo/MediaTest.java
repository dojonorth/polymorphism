package uk.co.bbc.dojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MediaTest {

    private MediaFactory factory = new MediaFactory();

    @Test
    public void shouldDecodeSimpleAudioByLowerCase() {
        Media underTest =  factory.create("simple","AUDIO","video");

        String decodedAudio = underTest.decodeAudio();

        assertThat(decodedAudio,is("audio"));
    }

    @Test
    public void shouldDecodeSimpleVideoByUpperCase() {
        Media underTest =  factory.create("simple","AUDIO","video");

        String decodedAudio = underTest.decodeVideo();

        assertThat(decodedAudio,is("VIDEO"));
    }

    @Test
    public void shouldDecodeAdvancedAudioByExpandingAndLowerCase() {
        Media underTest =  factory.create("advancedAudio","AUDIO","video");

        String decodedAudio = underTest.decodeAudio();

        assertThat(decodedAudio,is("aauuddiioo"));
    }

    @Test
    public void shouldDecodeVideoFromAdvancedAudioNormally() {
        Media underTest =  factory.create("advancedAudio","AUDIO","video");

        String decodedAudio = underTest.decodeVideo();

        assertThat(decodedAudio,is("VIDEO"));
    }


    @Test
    public void shouldDecodeVideoFromAdvancedBothByUpperCaseEveryOtherLetter() {
        Media underTest =  factory.create("advancedBoth","AUDIO","video");

        String decodedAudio = underTest.decodeVideo();

        assertThat(decodedAudio,is("ViDeO"));
    }

    @Test
    public void shouldDecodeAudioFromAdvancedBothByExpandAndLowerCase() {
        Media underTest =  factory.create("advancedBoth","AUDIO","video");

        String decodedAudio = underTest.decodeAudio();

        assertThat(decodedAudio,is("aauuddiioo"));
    }

    @Test
    public void shouldDecodeAdvancedVideoByUpperCaseEveryOtherLetter() {
        Media underTest =  factory.create("advancedVideo","AUDIO","video");

        String decodedAudio = underTest.decodeVideo();

        assertThat(decodedAudio,is("ViDeO"));
    }

    @Test
    public void shouldDecodeAudioFromAdvancedVideoNormally() {
        Media underTest =  factory.create("advancedVideo","AUDIO","video");

        String decodedAudio = underTest.decodeAudio();

        assertThat(decodedAudio,is("audio"));
    }
}
