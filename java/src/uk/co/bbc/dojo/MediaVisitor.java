package uk.co.bbc.dojo;

public interface MediaVisitor<T> {

    public T visit(SimpleMedia media);
    public T visit(AdvancedAudioMedia media);
    public T visit(AdvancedVideoMedia media);
    public T visit(AdvancedBothMedia media);
}
