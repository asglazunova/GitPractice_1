package SaimsTasks.SocialMedia;

public class FaceBookUserObjects {
    public static void main(String[] args) throws InterruptedException {

        FacebookUser userOne = new FacebookUser("JamesBond" , "james");
        System.out.println(userOne);

        FacebookUser userTwo = new FacebookUser("adam3232", "23232323", "Adam James" , 12, 4000);
        System.out.println(userTwo);

        userOne.sendFriendRequest(userTwo);
        // this -> userOne object
        // other -> userTwo
        System.out.println(userOne);
        System.out.println(userTwo);

       userOne.post("This is my first post!");

       Thread.sleep(10000);

        userOne.post("I like this app");

        System.out.println(userOne.getAllPosts());

        // ArrayList<FacebookUser>



    }
}
