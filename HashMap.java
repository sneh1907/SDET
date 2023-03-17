package sdet;

import java.util.Map;

public class HashMap {

	public static void main(String args[])
    {
        
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
  
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
  
        
        System.out.println("Value for 1 is " + hm.get(1));
  
        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
