package day52_inheritance;

public class AppObjects {

    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("YouTube");
        mobileApp.UseTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion(5.3);
        instagram.UseTheApp(20);
        instagram.download();

        Discord b22Discord = new Discord();
        b22Discord.setName("Discord");
        b22Discord.setVersion(6.234);
        b22Discord.UseTheApp(100);
        b22Discord.download();
        b22Discord.printInfo();
        System.out.println(b22Discord.getName());
    }
}