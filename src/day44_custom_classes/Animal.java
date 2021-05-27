package day44_custom_classes;

public class Animal {
    String type = "some animal";

    public void eat() {
        System.out.println("eating"); // attribute
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }
    public void speak() {
        System.out.println("speaking");
    }
    public void speak(String barking){
        System.out.println("speak "+ barking);
    }

}

class AnimalObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat();
        animal.eat("grass");
        animal.speak();
        animal.speak("wow wow");

        // create object cheetahObj

        Animal cheetahObj = new Animal();
        cheetahObj.type="cheetah"; //change value to "cheetah"
        System.out.println(cheetahObj.type);
        cheetahObj.eat("kebab");


    }

}
