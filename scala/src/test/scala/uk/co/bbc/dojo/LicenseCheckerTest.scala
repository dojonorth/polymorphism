package uk.co.bbc.dojo

import org.hamcrest.CoreMatchers._
import org.junit.Assert._
import org.junit.Test

class LicenseCheckerTest {
  private val factory: MediaFactory = new MediaFactory
  private val underTest: LicenseChecker = new LicenseChecker

  @Test
  def shouldTreatSimpleWith4VideoCharactersOrLessAsLicenseFree() = {
    val simple: Media = factory.create("simple", "AUDIO", "vide")
    val needsLicense: Boolean = underTest.needsLicense(simple)
    assertThat(needsLicense, is(false))
  }

  @Test
  def shouldTreatSimpleWith5VideoCharactersOrMoreAsLicensed() = {
    val simple: Media = factory.create("simple", "AUDIO", "video")
    val needsLicense: Boolean = underTest.needsLicense(simple)
    assertThat(needsLicense, is(true))
  }

  @Test
  def shouldTreatAdvancedAudioAsLicensed() = {
    val advancedAudio: Media = factory.create("advancedAudio", "AUDIO", "video")
    val needsLicense: Boolean = underTest.needsLicense(advancedAudio)
    assertThat(needsLicense, is(true))
  }

  @Test
  def shouldTreatAdvancedVideoAsLicensed() = {
    val advancedVideo: Media = factory.create("advancedVideo", "AUDIO", "video")
    val needsLicense: Boolean = underTest.needsLicense(advancedVideo)
    assertThat(needsLicense, is(true))
  }

  @Test
  def shouldTreatAdvancedBothAsLicensed() = {
    val advancedBoth: Media = factory.create("advancedBoth", "AUDIO", "video")
    val needsLicense: Boolean = underTest.needsLicense(advancedBoth)
    assertThat(needsLicense, is(true))
  }
}
