package uk.co.bbc.dojo

class LicenseChecker {
  private type needsLicense = PartialFunction[Media, Boolean]

  def needsLicense: needsLicense =
    needsAudioLicense.orElse(needsVideoLicense).orElse(needsLicenseForLength)

  private val needsAudioLicense: needsLicense = {
    case advanced: AdvancedAudioMedia => true
  }

  private val needsVideoLicense: needsLicense = {
    case advanced: AdvancedVideoMedia => true
  }

  private val needsLicenseForLength: needsLicense = {
    case simple: Media => simple.audio.length > 4 && simple.video.length > 4
  }

}