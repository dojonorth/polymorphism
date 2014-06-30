package uk.co.bbc.dojo

class MediaFactory {
  def create(mediaType: String, audio: String, video: String): Media = new MediaImpl(mediaType, audio, video)
}
