package uk.co.bbc.dojo;

public class AdvancedAudioDecoder implements AudioDecoder {
    @Override
    public String decode(String audio) {
        String s = audio.replaceAll("(.)", "$1$1");
        return s.toLowerCase();
    }
}
