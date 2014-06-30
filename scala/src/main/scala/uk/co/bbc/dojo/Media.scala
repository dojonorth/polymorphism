package uk.co.bbc.dojo

trait Media {
  val mediaType: String
  val audio: String
  val video: String
}

case class MediaImpl(mediaType: String, audio: String, video: String) extends Media
