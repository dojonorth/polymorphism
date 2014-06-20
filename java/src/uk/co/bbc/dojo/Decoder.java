package uk.co.bbc.dojo;

public class Decoder {

    public String decodeVideo(Media toDecode) {
        return toDecode.accept(new VideoVisitor());
    }

    public String decodeAudio(Media toDecode) {
        return toDecode.accept(new AudioVisitor());
    }
}
