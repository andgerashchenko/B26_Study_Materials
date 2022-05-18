package practice.social_media;

import java.time.LocalTime;
import java.util.ArrayList;

public class Facebook extends SocialMedia implements hasGroups{

    private int age;
    private int numberOfFriends;
    private ArrayList<Post> posts;

    @Override
    void DirectMessaging(String username, String message) {
        System.out.println(message+" sent to "+username);
    }

    @Override
    void Post(Object media) {

      posts.add(new Post((String)media));
    }

    @Override
    void Notifications() {
        if(LocalTime.now().getHour()>=8&&LocalTime.now().getHour()<=17){
            System.out.println("Notification");
        }else{
            System.out.println("Sleep mode");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }
    static {
        platform="Facebook";
    }

    public Facebook(String username, String password) {
        super.username=username;
        if(password.contains(username)){
            super.password="password";
            System.out.println("Password contained username. Default password created: ‘password’");
        }else{
            super.password=password;}

        super.personalURL="facebook.com/"+username;
        posts = new ArrayList<Post>();

    }

    public Facebook(String username, String password, String fullName){
        this(username, password);
        for (int i = 0; i < fullName.length(); i++) {
            if(!Character.isAlphabetic(fullName.charAt(i))){
                super.fullName="no name";
                System.out.println("invalid name");
            }else{
                super.fullName=fullName;
            }
        }

        super.fullName=fullName;

    }
    public Facebook(String username, String password, String fullName, int age, int numberOfFriends){
        this(username, password, fullName);
        if(age>=0){
            this.age=age;
        }else{
            System.out.println("Invalid age");
            this.age=0;
        }
        if(numberOfFriends>=0&&numberOfFriends<=5000){
            this.numberOfFriends=numberOfFriends;
        }else{
            System.out.println("Invalid Number of friends");
            this.numberOfFriends=0;
        }

    }

    @Override
    public String toString() {
        return "Facebook{" +
                "age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", posts=" + posts +
                ", personalURL='" + personalURL + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
    public boolean sendFriendRequest(Facebook self, Facebook friend){
        if(self.numberOfFriends==5000){
            System.out.println("You have reached the limit of friends.");
            return false;
        }
        if(friend.numberOfFriends==5000){
            System.out.println(friend.username+" cannot accept any more friend request");
            return false;
        }
        System.out.println("Friend request sent to "+friend.username);
        return true;
    }
    int numberOfGroups;

    @Override
    public void joinGroup(String group) {
        System.out.println(username+ " has join "+group);
        numberOfGroups++;
    }

    @Override
    public void leaveGroup(String group) {
        System.out.println(username+ " has left "+group);
        numberOfGroups--;
    }
}
