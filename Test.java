// Parent class
class Animal {
}

// Child class
class Dog extends Animal {
}

// Another child class
class Cat extends Animal {
}

public class Test {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // myDog is a Dog
        Animal myCat = new Cat(); // myCat is a Cat

        // Check if myDog is an instance of Dog
        if (myDog instanceof Dog) {
            System.out.println("myDog is a Dog!");
        }

        // Check if myDog is an instance of Animal
        if (myDog instanceof Animal) {
            System.out.println("myDog is an Animal!");
        }

        // Check if myCat is an instance of Cat
        if (myCat instanceof Cat) {
            System.out.println("myCat is a Cat!");
        }

        // Check if myCat is an instance of Dog
        if (myCat instanceof Dog) {
            System.out.println("myCat is a Dog!"); // This will not print
        } else {
            System.out.println("myCat is NOT a Dog!"); // This will print
        }
    }
}