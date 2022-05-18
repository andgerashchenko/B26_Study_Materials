package practice.social_media;

public abstract class SocialMedia {
    String personalURL;
    int accountLength;
    static String platform;
    String username;
    String password;
    String fullName;

    abstract void DirectMessaging(String username, String message);

    abstract void Post(Object media);

    abstract void Notifications();
}

