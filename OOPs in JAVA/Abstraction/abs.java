package Abstraction;

abstract class Animal {
    abstract void walk();

    void breathe() {
        System.out.println("Breathe in the air");
    }
    Animal() {
        System.out.println("You are about to create an Animal.");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }

    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }

    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class abs {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.breathe();
        h1.walk();
    }
}
