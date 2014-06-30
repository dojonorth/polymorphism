package uk.co.bbc.dojo

class LicenseChecker {
  def needsLicense(toCheck: Media): Boolean = {

    toCheck.mediaType match {
      case "simple" if toCheck.video.length < 5 => false
      case _ => true
    }
  }

}
