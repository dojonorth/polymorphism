package uk.co.bbc.dojo

case class Media(val mediaType: String, val audio: String, val video: String, val audioDecoder: String => String, val videoDecoder: String => String) {
  def decodedAudio = audioDecoder(audio)
  def decodedVideo = videoDecoder(video)
}


