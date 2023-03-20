package sdet;

import java.util.*;

public class TreeSet {

	
	    public static void main(String[] args)
	    {
	        
	    	NavigableSet<String> ts = new TreeSet<>();
	    	  
	  
	        
	        ts.add("Taneja");
	        ts.add("Sneha");
	        ts.add("Taneja");
	  
	          
	        System.out.println("Tree Set is " + ts);
	  
	        String check = "Taneja";
	  
	        //
	        System.out.println("Contains " + check + " "
	                           + ts.contains(check));
	  
	       
	        System.out.println("First Value " + ts.first());
	  
	        
	        System.out.println("Last Value " + ts.last());
	  
	        String val = "Tanej";
	  
	      
	        System.out.println("Higher " + ts.higher(val));
	        System.out.println("Lower " + ts.lower(val));
	    }
	}

