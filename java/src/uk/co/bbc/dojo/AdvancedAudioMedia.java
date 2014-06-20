package uk.co.bbc.dojo;

public class AdvancedAudioMedia extends MediaImpl {

    public AdvancedAudioMedia(String audio, String video) {
        super(audio, video);
    }

    @Override
    public <T> T accept(MediaVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
