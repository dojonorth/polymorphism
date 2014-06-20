package uk.co.bbc.dojo;

public class AdvancedVideoDecoder implements VideoDecoder {
    @Override
    public String decode(String video) {
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
