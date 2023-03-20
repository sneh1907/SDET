package sdet;

public class SuperConstructor {
	// default or no-arg constructor of class Animal
	SuperConstructor() {
	    System.out.println("I am an animal");
	  }
	}

	class Dog extends SuperConstructor {

	  // default or no-arg constructor of class Dog
	  Dog() {

	    // calling default constructor of the superclass
	    super();

	    System.out.println("I am a dog");
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    Dog dog1 = new Dog();
	  }
	}

