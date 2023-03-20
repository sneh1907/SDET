package sdet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment2 {
	public static String findDestination(List<List<String>> paths) 
	{
		
		Set<String> startCities = new HashSet<>();
		Set<String> endCities = new HashSet<>();
		
		for (List<String> path : paths) 
		{
			startCities.add(path.get(0));
			endCities.add(path.get(1));
		}
		for(String endCity : endCities)
		{
			if (!startCities.contains(endCity))
			{
				return endCity;

			}
		}
		
		
		return null;
	}
	public static void main(String[] args) 
	{
		
		List<List<String>> paths = new ArrayList<>();
		
		
		paths.add(Arrays.asList("London", "New York"));
		paths.add(Arrays.asList("New York", "Lima"));
		paths.add(Arrays.asList("Lima", "Sao Paulo"));
		
		
		
		String desti = findDestination(paths);
		
		
		System.out.println(desti);
	}

}
