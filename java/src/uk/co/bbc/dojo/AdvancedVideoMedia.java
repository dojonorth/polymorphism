package uk.co.bbc.dojo;

public class AdvancedVideoMedia extends MediaImpl {

    public AdvancedVideoMedia(String audio, String video) {
        super(audio, video);
    }

    @Override
    public <T> T accept(MediaVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
