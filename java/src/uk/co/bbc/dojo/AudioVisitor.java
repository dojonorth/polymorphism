package uk.co.bbc.dojo;

public class AudioVisitor implements MediaVisitor<String> {

    @Override
    public String visit(SimpleMedia media) {
        return decodeSimple(media.getAudio());
    }

    @Override
    public String visit(AdvancedAudioMedia media) {
        return decodeAdvanced(media.getAudio());
    }

    @Override
    public String visit(AdvancedVideoMedia media) {
        return decodeSimple(media.getAudio());
    }

    @Override
    public String visit(AdvancedBothMedia media) {
        return decodeAdvanced(media.getAudio());
    }

    private String decodeSimple(String audio) {
        return audio.toLowerCase();
    }

    private String decodeAdvanced(String audio) {
        String s = audio.replaceAll("(.)", "$1$1");
        return s.toLowerCase();
    }
}
