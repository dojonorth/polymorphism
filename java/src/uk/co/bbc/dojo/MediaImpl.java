package uk.co.bbc.dojo;

public abstract class MediaImpl implements Media {

    private String audio;

    private String video;

    public MediaImpl(String audio, String video) {
        this.audio = audio;
        this.video = video;
    }

    public String getAudio() {
        return audio;
    }

    public String getVideo() {
        return video;
    }
}
