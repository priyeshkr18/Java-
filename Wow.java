// Abstract class
abstract class Animal {
	// Abstract method
	abstract void makeSound(); // No body, just a declaration
}

// Subclass
class Dog extends Animal {
	// Implementing the abstract method
	void makeSound() {
			System.out.println("Dog barks");
	}
}

// Another subclass
class Cat extends Animal {
	// Implementing the abstract method
	void makeSound() {
			System.out.println("Cat meows");
	}
}

public class Wow {
	public static void main(String[] args) {
			Animal myDog = new Dog(); // Create a Dog object
			Animal myCat = new Cat(); // Create a Cat object

			myDog.makeSound(); // Calls Dog's implementation
			myCat.makeSound(); // Calls Cat's implementation
	}
}
