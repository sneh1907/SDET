package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class assign3 {
	public static String destCity(List<List<String>> paths) {
        HashMap<String, Integer> outdegree = new HashMap<String, Integer>();
        for(List<String> x: paths)
            if(outdegree.containsKey(x.get(0)))
                outdegree.put(x.get(0), outdegree.get(x.get(1))+1);
            else
               outdegree.put(x.get(0), 1);
        
        for(List<String> x: paths)
               if(!outdegree.containsKey(x.get(0)))
                    return x.get(0);
               else if(!outdegree.containsKey(x.get(1)))
                    return x.get(1);
            
        return paths.get(0).get(0);
    }
    
  public static void main (String[] args) throws java.lang.Exception{
    List<List<String>> paths = new ArrayList<List<String>>();
    paths.add(new ArrayList(Arrays.asList("London","New York")));
    paths.add(new ArrayList(Arrays.asList("New York","Lima")));
    paths.add(new ArrayList(Arrays.asList("Lima","Sao Paulo")));
}
}




