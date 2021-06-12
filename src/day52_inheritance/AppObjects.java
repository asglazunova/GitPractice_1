package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("Youtube");
        mobileApp.UseTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
        mobileApp.setName("Instagram");
        instagram.UseTheApp(20);
        instagram.download();

        Discord b22Discord  = new Discord();
        b22Discord.setName("Discord");
        b22Discord.UseTheApp(100);
        b22Discord.download();
    }
}
