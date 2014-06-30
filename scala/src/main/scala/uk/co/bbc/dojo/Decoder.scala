package uk.co.bbc.dojo

class Decoder {
  def decodeVideo(toDecode: Media): String = {

    toDecode.mediaType match {
      case s if (s.contains("simple") ||  s.contains("advancedAudio")) => toDecode.video.toUpperCase

      case st if (st.startsWith("advanced") &&  !st.endsWith("Audio")) => {
        val decodedAudio = toDecode.video.toLowerCase
        var res = ""
        for((i, index) <- decodedAudio.toList.zipWithIndex) {
          if (index % 2 == 0) res += i.toString.toUpperCase
          else res += i.toString
        }
        res
      }
    }
  }

  def decodeAudio(toDecode: Media): String = {

    toDecode.mediaType match {
      case s if (s.contains("simple") || s.contains("advancedVideo")) => toDecode.audio.toLowerCase

      case st if (st.startsWith("advanced") &&  !st.endsWith("Video")) => {
        (for {
          i <- toDecode.audio.toLowerCase.toList
        } yield (i.toString + i.toString)).mkString
      }
    }
  }
}
