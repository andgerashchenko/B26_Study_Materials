package practice.social_media;

import java.time.LocalTime;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Post a = new Post("asd");
        System.out.println(a.getDateTime());
        System.out.println(LocalTime.now().getHour());
        ArrayList<SocialMedia> list = new ArrayList<>();

        Facebook facebook = new Facebook("jamesbond","pass","James Bond");
        Facebook instagram2 = new Facebook("jamesbond","pass","James Bond");
        Instagram instagram = new Instagram("johndoe", "red","");
        Instagram instagram1 = new Instagram("john", "yellow","");

        list.add(facebook);
        list.add(instagram);
        System.out.println(list);

         instagram.likePicture();

        System.out.println(facebook.fullName.equals(instagram2.fullName));
    }
}
