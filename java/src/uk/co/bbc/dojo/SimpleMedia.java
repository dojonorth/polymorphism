package uk.co.bbc.dojo;

public class SimpleMedia extends MediaImpl {

    public SimpleMedia(String audio, String video) {
        super(audio, video);
    }

    @Override
    public <T> T accept(MediaVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
