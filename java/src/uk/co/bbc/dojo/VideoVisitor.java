package uk.co.bbc.dojo;

public class VideoVisitor implements MediaVisitor<String> {

    @Override
    public String visit(SimpleMedia media) {
        return decodeSimple(media.getVideo());
    }

    @Override
    public String visit(AdvancedAudioMedia media) {
        return decodeSimple(media.getVideo());
    }

    @Override
    public String visit(AdvancedVideoMedia media) {
        return decodeAdvanced(media.getVideo());
    }

    @Override
    public String visit(AdvancedBothMedia media) {
        return decodeAdvanced(media.getVideo());
    }


    private String decodeSimple(String video) {
        return video.toUpperCase();
    }

    private String decodeAdvanced(String video) {
        String out = "";
        for (char c : video.toCharArray()) {
            if (out.isEmpty() || Character.isLowerCase(out.charAt(out.length() - 1))) {
                out += Character.toUpperCase(c);
            } else {
                out += Character.toLowerCase(c);
            }
        }
        return out;
    }
}
