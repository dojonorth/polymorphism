package uk.co.bbc.dojo;

public class MediaFactory {

    public Media create(String type, String audio, String video) {
        switch (type) {
            case "simple":
                return new SimpleMedia(audio, video);
            case "advancedAudio":
                return new AdvancedAudioMedia(audio, video);
            case "advancedVideo":
                return new AdvancedVideoMedia(audio, video);
            case "advancedBoth":
                return new AdvancedBothMedia(audio, video);
        }
        return null;
    }
}
