package uk.co.bbc.dojo

class MediaFactory {
  def create(mediaType: String, audio: String, video: String) = mediaType match {
    case "simple" => SimpleMedia(audio, video)
    case "advancedAudio" => AdvancedAudioMedia(audio, video)
    case "advancedVideo" => AdvancedVideoMedia(audio, video)
    case "advancedBoth" => AdvancedBothMedia(audio, video)
  }
}