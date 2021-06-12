package day51_inheritance.Super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL lyftXLRide =new LyftXL();
        Lux LuxRide = new Lux();

        System.out.println("lyftRide.calculateRate(5) = " + lyftRide.calculateRate(5));
        System.out.println("lyftXLRide.calculateRate(5) = " + lyftXLRide.calculateRate(5));
        System.out.println("LuxRide.calculateRate(5) = " + LuxRide.calculateRate(5));
    }
}
