package uk.co.bbc.dojo

class MediaFactory {
  def create(mediaType: String, audio: String, video: String): Media = {
    mediaType match {
      case "simple"        => new Media(audio, video) with Audio with Video
      case "advancedAudio" => new Media(audio, video) with AdvancedAudio with Video
      case "advancedVideo" => new Media(audio, video) with Audio with AdvancedVideo
      case "advancedBoth"  => new Media(audio, video) with AdvancedAudio with AdvancedVideo
    }
  }
}
