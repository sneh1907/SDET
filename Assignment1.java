package test;

public class Assignment1 {
	public static void main(String[] args) {
			
			String input = "abacbc";
			char search = 'a'; 
			char search1 ='b'; 
			char search2='c';
			int count=0;
			int count1=0;
			int count2=0;
			for(int i=0; i<input.length(); i++)
			{
			if(input.charAt(i) == search)
			count++;
			else if(input.charAt(i) == search1)
			count1++;
			
			else if(input.charAt(i) == search2)
			count2++;
			}
			
			if ((count==count1) && (count1==count2))
			{
			System.out.println("All Characters Have Equal Number of Occurrences");
			}
			
			else
			{
			System.out.println("all Characters Have Different Number of Occurrences");
			}
			
	}
}
