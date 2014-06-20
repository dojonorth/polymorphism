package uk.co.bbc.dojo;

public class MediaImpl implements Media {

    private AudioDecoder audioDecoder;

    private VideoDecoder videoDecoder;

    private String audio;

    private String video;

    public MediaImpl(String audio, String video) {
        this.audio = audio;
        this.video = video;
    }

    @Override
    public String decodeAudio() {
        return audioDecoder.decode(audio);
    }

    @Override
    public String decodeVideo() {
        return videoDecoder.decode(video);
    }

    public void setAudioDecoder(AudioDecoder audioDecoder) {
        this.audioDecoder = audioDecoder;
    }

    public void setVideoDecoder(VideoDecoder videoDecoder) {
        this.videoDecoder = videoDecoder;
    }
}
