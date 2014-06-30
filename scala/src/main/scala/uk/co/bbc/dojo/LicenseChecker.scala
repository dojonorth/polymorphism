package uk.co.bbc.dojo

class LicenseChecker {
  
  def needsLicense: needsLicense =
    needsAudioLicense.orElse(needsVideoLicense).orElse(needsLicenseForLength)

  private val needsAudioLicense: PartialFunction[Media, Boolean] = {
    case advanced: AdvancedAudioMedia => true
  }

  private val needsVideoLicense: PartialFunction[Media, Boolean] = {
    case advanced: AdvancedVideoMedia => true
  }

  private val needsLicenseForLength: PartialFunction[Media, Boolean] = {
    case simple: Media => simple.audio.length > 4 && simple.video.length > 4
  }

}
