package sdet;

public class PrameteriseConsturctorSuperK {
	// default or no-arg constructor
	PrameteriseConsturctorSuperK() {
	    System.out.println("I am an animal");
	  }

	  // parameterized constructor
	PrameteriseConsturctorSuperK(String type) {
	    System.out.println("Type: "+type);
	  }
	}

	class Dog extends PrameteriseConsturctorSuperK {

	  // default constructor
	  Dog() {

	    // calling parameterized constructor of the superclass
	    super("Animal");

	    System.out.println("I am a dog");
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    Dog dog1 = new Dog();
	  }
	
}
