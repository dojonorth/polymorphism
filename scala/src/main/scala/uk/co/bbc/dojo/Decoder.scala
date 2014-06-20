package uk.co.bbc.dojo

/** Note: this decoder class is basically redundant in this implementation. */
class Decoder {
  def decodeVideo(toDecode: Media): String = toDecode.decodedVideo
  def decodeAudio(toDecode: Media): String = toDecode.decodedAudio
}
