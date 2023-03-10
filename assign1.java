package test;

public class assign1 {
	public boolean areOccurrencesEqual(String s) {
        int[] counts = new int[26];
       char[] array = s.toCharArray();
       for (char c : array) {
           counts[c-'a']++;
         //  System.out.println("count is: +i");
       }
       int cnt = counts[array[0] - 'a'];
       for (int i = 0; i < 26; i++) {
           if (counts[i] != 0 && counts[i] != cnt) {
               System.out.println("count is: +i");
               return false;
           }
       }
       return true;
	}}
