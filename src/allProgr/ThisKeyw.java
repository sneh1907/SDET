package sdet;

public class ThisKeyw {
	String name;

	   // setter method
	   void setName( String name ) {
	       this.name = name;
	   }

	   // getter method
	   String getName(){
	       return this.name;
	   }

	   public static void main( String[] args ) {
	       Main obj = new Main();

	       // calling the setter and the getter method
	       obj.setName("Toshiba");
	       System.out.println("obj.name: "+obj.getName());
	   }
	
}
