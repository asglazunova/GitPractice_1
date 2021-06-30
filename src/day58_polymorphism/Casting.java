package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object of superMan

        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();
// up casting
        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();


        //DownCasting from worker to superman
       // SuperMan
    }
}
