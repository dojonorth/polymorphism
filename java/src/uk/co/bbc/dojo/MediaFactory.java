package uk.co.bbc.dojo;

public class MediaFactory {

    public Media create(String type, String audio, String video) {

        MediaImpl media= new MediaImpl(audio,video);

        switch (type) {
            case "simple":
                media.setAudioDecoder(new SimpleAudioDecoder());
                media.setVideoDecoder(new SimpleVideoDecoder());
                break;
            case "advancedAudio":
                media.setAudioDecoder(new AdvancedAudioDecoder());
                media.setVideoDecoder(new SimpleVideoDecoder());
                break;
            case "advancedVideo":
                media.setAudioDecoder(new SimpleAudioDecoder());
                media.setVideoDecoder(new AdvancedVideoDecoder());
                break;
            case "advancedBoth":
                media.setAudioDecoder(new AdvancedAudioDecoder());
                media.setVideoDecoder(new AdvancedVideoDecoder());
                break;
        }
        return media;
    }
}
