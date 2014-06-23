package uk.co.bbc.dojo

object Decoders {

    val simpleAudioDecoder = (audio: String) => audio.toLowerCase
    val simpleVideoDecoder = (video: String) => video.toUpperCase
    val advancedAudioDecoder =  (audio: String) => ("audio" flatMap { c => List(c.toString, c.toString) }).mkString
    val advancedVideoDecoder = (video: String) => {
        val sbuilder = new StringBuilder
        for (i <- 0 until video.length) {
            sbuilder += (if (i % 2 == 0) video(i).toUpper else video(i).toLower)
        }
        sbuilder.toString()
    }
}