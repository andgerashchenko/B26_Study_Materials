package practice.social_media;

public class Picture {
    private final byte[] image;
    private final String extension;
    private String caption;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public byte[] getImage() {
        return image;
    }

    public String getExtension() {
        return extension;
    }

    public Picture(byte[] image, String extension, String caption) {
        this.image = image;
        this.extension = extension;
        this.caption = caption;
    }
}
