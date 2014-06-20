package uk.co.bbc.dojo;

public class AdvancedBothMedia extends MediaImpl {

    public AdvancedBothMedia(String audio, String video) {
        super(audio, video);
    }

    @Override
    public <T> T accept(MediaVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
