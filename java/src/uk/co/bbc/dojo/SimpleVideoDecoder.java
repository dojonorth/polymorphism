package uk.co.bbc.dojo;

public class SimpleVideoDecoder implements VideoDecoder {
    @Override
    public String decode(String video) {
        return video.toUpperCase();
    }
}
