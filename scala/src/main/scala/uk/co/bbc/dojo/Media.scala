package uk.co.bbc.dojo

class Media(val audio: String, val video: String) extends Audio with Video {
  def decodedAudio = decodeAudio(audio)
  def decodedVideo = decodeVideo(video)
}

trait Audio {
  def decodeAudio(audio: String): String = audio.toLowerCase
}

trait Video {
  def decodeVideo(video: String): String = video.toUpperCase
}

trait AdvancedAudio extends Audio {
  override def decodeAudio(audio: String): String =
    ("audio" flatMap { c => List(c.toString, c.toString) }).mkString
}

trait AdvancedVideo extends Video {
  override def decodeVideo(video: String): String = {
    val sbuilder = new StringBuilder
    for (i <- 0 until video.length) {
      sbuilder += (if (i % 2 == 0) video(i).toUpper else video(i).toLower)
    }
    sbuilder.toString()
  }
}
