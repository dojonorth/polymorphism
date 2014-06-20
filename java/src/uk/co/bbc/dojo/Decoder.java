package uk.co.bbc.dojo;

public class Decoder {

    public String decodeVideo(Media toDecode) {
        return toDecode.decodeVideo();
    }

    public String decodeAudio(Media toDecode) {
        return toDecode.decodeAudio();
    }
}
