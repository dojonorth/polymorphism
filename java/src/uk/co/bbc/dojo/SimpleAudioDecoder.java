package uk.co.bbc.dojo;

public class SimpleAudioDecoder implements AudioDecoder {

    @Override
    public String decode(String audio) {
        return audio.toLowerCase();
    }
}
