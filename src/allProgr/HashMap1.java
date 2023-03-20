package sdet;

import java.util.Map;

public class HashMap1 {
	public static void main(String args[])
    {
	 HashMap<Integer, String> hm = new HashMap<Integer, String>();
	  
     hm.put(1, "Taneja");
     hm.put(2, "Sneha");
     hm.put(3, "Manoj");

     
     System.out.println("Value for 1 is " + hm.get(1));

    
     for (Map.Entry<Integer, String> e : hm.entrySet())
         System.out.println(e.getKey() + " " + e.getValue());
 
}
}