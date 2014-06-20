package uk.co.bbc.dojo;

public interface Media {

    public <T> T accept(MediaVisitor<T> visitor);

}
