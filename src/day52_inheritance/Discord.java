package day52_inheritance;

public class Discord extends MobileApp{
    public void chat (String someone){
        System.out.println("Chatting with " + someone);
    }
    /**
     * override download method
     */

    @Override
    protected boolean download() {
        System.out.println("Download Discord 0.0.23 from App Store ");
        return true;
    }




    @Override
    public void UseTheApp(int minutes){
        super.UseTheApp(minutes);
        chat("Vlad");

    }
}
