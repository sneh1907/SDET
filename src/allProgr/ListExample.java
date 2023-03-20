package sdet;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String args[]){  
		 
		 List<String> list=new ArrayList<String>();  
		  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		   
		 System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0  
		  
		 list.set(1,"Dates");  
		 
		 for(String fruit:list)  
		  System.out.println(fruit);  
		  
		 }  
}
