package uk.co.bbc.dojo

class MediaFactory {
  def create(mediaType: String, audio: String, video: String): Media = {
    mediaType match {
      case "simple"        => new Media(audio, video, Decoders.simpleAudioDecoder, Decoders.simpleVideoDecoder)
      case "advancedAudio" => new Media(audio, video, Decoders.advancedAudioDecoder, Decoders.simpleVideoDecoder)
      case "advancedVideo" => new Media(audio, video, Decoders.simpleAudioDecoder, Decoders.advancedVideoDecoder)
      case "advancedBoth"  => new Media(audio, video, Decoders.advancedAudioDecoder, Decoders.advancedVideoDecoder)
    }
  }
}
