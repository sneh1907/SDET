package sdet;

public class SuperKeyw {
	// overridden method
	  public void display(){
	    System.out.println("I am an animal");
	  }
	}

	class Dog extends SuperKeyw {

	  // overriding method
	  @Override
	  public void display(){
	    System.out.println("I am a dog");
	  }

	  public void printMessage(){

	    // this calls overriding method
	    display();

	    // this calls overridden method
	    super.display();
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    Dog dog1 = new Dog();
	    dog1.printMessage();
	  }
	
}
