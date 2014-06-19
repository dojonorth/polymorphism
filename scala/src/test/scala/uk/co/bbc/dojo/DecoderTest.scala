package uk.co.bbc.dojo

import org.hamcrest.CoreMatchers._
import org.junit.Assert._
import org.junit.Test

class DecoderTest {
  private val factory: MediaFactory = new MediaFactory
  private val underTest: Decoder = new Decoder

  @Test
  def shouldDecodeSimpleAudioByLowerCase() = {
    val media: Media = factory.create("simple", "AUDIO", "video")
    val decodedAudio: String = underTest.decodeAudio(media)
    assertThat(decodedAudio, is("audio"))
  }

  @Test def shouldDecodeSimpleVideoByUpperCase() = {
    val media: Media = factory.create("simple", "AUDIO", "video")
    val decodedAudio: String = underTest.decodeVideo(media)
    assertThat(decodedAudio, is("VIDEO"))
  }

  @Test def shouldDecodeAdvancedAudioByExpandingAndLowerCase() = {
    val media: Media = factory.create("advancedAudio", "AUDIO", "video")
    val decodedAudio: String = underTest.decodeAudio(media)
    assertThat(decodedAudio, is("aauuddiioo"))
  }

  @Test def shouldDecodeVideoFromAdvancedAudioNormally() = {
    val media: Media = factory.create("advancedAudio", "AUDIO", "video")
    val decodedAudio: String = underTest.decodeVideo(media)
    assertThat(decodedAudio, is("VIDEO"))
  }

  @Test def shouldDecodeVideoFromAdvancedBothByUpperCaseEveryOtherLetter() = {
    val media: Media = factory.create("advancedBoth", "AUDIO", "video")
    val decodedAudio: String = underTest.decodeVideo(media)
    assertThat(decodedAudio, is("ViDeO"))
  }

  @Test def shouldDecodeAudioFromAdvancedBothByExpandAndLowerCase() = {
    val media: Media = factory.create("advancedBoth", "AUDIO", "video")
    val decodedAudio: String = underTest.decodeAudio(media)
    assertThat(decodedAudio, is("aauuddiioo"))
  }

  @Test def shouldDecodeAdvancedVideoByUpperCaseEveryOtherLetter() = {
    val media: Media = factory.create("advancedVideo", "AUDIO", "video")
    val decodedAudio: String = underTest.decodeVideo(media)
    assertThat(decodedAudio, is("ViDeO"))
  }

  @Test def shouldDecodeAudioFromAdvancedVideoNormally() = {
    val media: Media = factory.create("advancedVideo", "AUDIO", "video")
    val decodedAudio: String = underTest.decodeAudio(media)
    assertThat(decodedAudio, is("audio"))
  }
}