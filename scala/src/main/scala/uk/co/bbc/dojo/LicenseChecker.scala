package uk.co.bbc.dojo

class LicenseChecker {
  /**
   * Note: took a different approach with licence checker (basically could have
   * taken this same approach with decoding, too, but doing it this way gives
   * me the ability to try both ways in one dojo).
   */
  def needsLicense(toCheck: Media): Boolean = {
    toCheck match {
      case Media("simple",_,_,_,_) => toCheck.video.length > 4
      case _ => true
    }
  }
}
