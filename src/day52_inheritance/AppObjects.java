package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "YouTube";
        mobileApp.UseTheApp(10);

        Instagram instagram = new Instagram();
        mobileApp.name ="Instagram";
        instagram.UseTheApp(20);

        Discord b22Discord  = new Discord();
        b22Discord.name  = "Discord";
        b22Discord.UseTheApp(100);
    }
}
