package day50_inheritance.overriding;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Gray";
        animal.type = "Pitbul";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

        dog dog = new dog();
        dog.speak();
    }
}
