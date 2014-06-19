package uk.co.bbc.dojo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DecoderTest {

    private MediaFactory factory = new MediaFactory();

    private Decoder underTest = new Decoder();

    @Test
    public void shouldDecodeSimpleAudioByLowerCase() {
        Media media =  factory.create("simple","AUDIO","video");

        String decodedAudio = underTest.decodeAudio(media);

        assertThat(decodedAudio,is("audio"));
    }

    @Test
    public void shouldDecodeSimpleVideoByUpperCase() {
        Media media =  factory.create("simple","AUDIO","video");

        String decodedAudio = underTest.decodeVideo(media);

        assertThat(decodedAudio,is("VIDEO"));
    }

    @Test
    public void shouldDecodeAdvancedAudioByExpandingAndLowerCase() {
        Media media =  factory.create("advancedAudio","AUDIO","video");

        String decodedAudio = underTest.decodeAudio(media);

        assertThat(decodedAudio,is("aauuddiioo"));
    }

    @Test
    public void shouldDecodeVideoFromAdvancedAudioNormally() {
        Media media =  factory.create("advancedAudio","AUDIO","video");

        String decodedAudio = underTest.decodeVideo(media);

        assertThat(decodedAudio,is("VIDEO"));
    }


    @Test
    public void shouldDecodeVideoFromAdvancedBothByUpperCaseEveryOtherLetter() {
        Media media =  factory.create("advancedBoth","AUDIO","video");

        String decodedAudio = underTest.decodeVideo(media);

        assertThat(decodedAudio,is("ViDeO"));
    }

    @Test
    public void shouldDecodeAudioFromAdvancedBothByExpandAndLowerCase() {
        Media media =  factory.create("advancedBoth","AUDIO","video");

        String decodedAudio = underTest.decodeAudio(media);

        assertThat(decodedAudio,is("aauuddiioo"));
    }

    @Test
    public void shouldDecodeAdvancedVideoByUpperCaseEveryOtherLetter() {
        Media media =  factory.create("advancedVideo","AUDIO","video");

        String decodedAudio = underTest.decodeVideo(media);

        assertThat(decodedAudio,is("ViDeO"));
    }

    @Test
    public void shouldDecodeAudioFromAdvancedVideoNormally() {
        Media media =  factory.create("advancedVideo","AUDIO","video");

        String decodedAudio = underTest.decodeAudio(media);

        assertThat(decodedAudio,is("audio"));
    }
}
