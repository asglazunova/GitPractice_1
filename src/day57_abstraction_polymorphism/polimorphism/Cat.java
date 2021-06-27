package day57_abstraction_polymorphism.polimorphism;

public class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Cat is saying Meow");
    }
}
