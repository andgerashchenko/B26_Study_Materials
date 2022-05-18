package practice.social_media;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements hasPictures{
    private int numberOfFollowers;
    private int numberOfFollowings;
    private ArrayList<Picture> pictures;
    static {platform="Instagram";}

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfFollowings() {
        return numberOfFollowings;
    }

    public void setNumberOfFollowings(int numberOfFollowings) {
        this.numberOfFollowings = numberOfFollowings;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }
    public Instagram(String username, String password, String fullName){
        super.username=username;
        super.password=password;
        super.fullName=fullName;
        super.personalURL="Instagram.com/"+username;
    }

    @Override
    void DirectMessaging(String username, String message) {
        System.out.println(message+" sent to "+username);
    }

    @Override
    void Post(Object media) {
        pictures = new ArrayList<Picture>();// not sure if we need to create object in the method
        pictures.add((Picture)media);
    }

    @Override
    void Notifications() {
        if(LocalTime.now().getHour()>=10&&LocalTime.now().getHour()<=20){
            System.out.println("Notification");
        }else{
            System.out.println("Sleep mode");
        }
    }

    @Override
    public void likePicture() {
        System.out.println("Like");
    }

    @Override
    public void unLikePicture() {
        System.out.println("Unlike");
    }

    @Override
    public void sharePicture() {
        System.out.println("Share");
    }

    @Override
    public String toString() {
        return "Instagram{" +
                "numberOfFollowers=" + numberOfFollowers +
                ", numberOfFollowings=" + numberOfFollowings +
                ", pictures=" + pictures +
                ", personalURL='" + personalURL + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
