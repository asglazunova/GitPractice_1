package day51_inheritance.Super_keyword;

public class Lux extends Lyft{
    @Override
    public double calculateRate (double miles){
        return super.calculateRate(miles) * 1.2;
    }
}
