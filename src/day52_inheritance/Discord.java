package day52_inheritance;

public class Discord extends MobileApp{
    public void chat (String someone){
        System.out.println("Chatting with " + someone);
    }
    /**
     * override download method
     */
    @Override
    public boolean download() {
        System.out.println("Downloaded Discord 0.0.23 from App Store");
        return true;
    }

    @Override
    public void UseTheApp(int minutes) {
        super.UseTheApp(minutes);
        chat("Vladislav");
    }

    public void printInfo() {
        System.out.println("App Name = " + getName());
        System.out.println("App Version = " + getVersion());
    }
}
