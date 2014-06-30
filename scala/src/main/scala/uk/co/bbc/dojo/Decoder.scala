package uk.co.bbc.dojo

class Decoder {

  def decodeVideo(toDecode: Media) = decodeAdvancedVideo.orElse(decodeSimpleVideo)(toDecode)(toDecode.video)

  private val oddCharLower: String => String = _.toUpperCase.zipWithIndex.map {
    case (c, i) if i % 2 == 1 => c.toLower
    case (c, i) if i % 2 == 0 => c.toUpper
  }.mkString

  private val decodeAdvancedVideo: PartialFunction[Media, String => String] = {
    case advanced: AdvancedVideo => oddCharLower
  }

  private val decodeSimpleVideo: PartialFunction[Media, String => String] = {
    case simple => _.toUpperCase
  }

  def decodeAudio(toDecode: Media) = decodeAdvancedAudio.orElse(decodeSimpleAudio)(toDecode)(toDecode.audio)

  private val repeatEachCharTwice: String => String = _.map(_.toString * 2).mkString

  private val decodeAdvancedAudio: PartialFunction[Media, String => String] = {
    case advanced: AdvancedAudio => repeatEachCharTwice.andThen(_.toLowerCase)
  }

  private val decodeSimpleAudio: PartialFunction[Media, String => String] = {
    case simple => _.toLowerCase
  }
}