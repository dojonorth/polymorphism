package uk.co.bbc.dojo

trait Media {
  def audio: String
  def video: String
}


case class SimpleMedia(audio: String, video: String) extends Media

trait AdvancedAudio

case class AdvancedAudioMedia(audio: String, video: String) extends AdvancedAudio with Media

trait AdvancedVideo

case class AdvancedVideoMedia(audio: String, video: String) extends AdvancedVideo with Media

case class AdvancedBothMedia(audio: String, video: String) extends AdvancedAudio with AdvancedVideo with Media


