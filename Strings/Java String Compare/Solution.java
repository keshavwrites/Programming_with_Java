// github.com/andy489

import java.util.*;

public class Solution {
    
    public static String getSmallestAndLargestCompareTo(String s, int k) {
        String substring = s.substring(0, k);
        String smallest = substring;
        String largest = substring;
        
        for (int i = 1; i <= s.length() - k; i++) {
            // Create a substring of length 'k'
            substring = s.substring(i, i + k);
            	
            // If current substring is lexicographically smaller than 'smallest'
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            
            // If current substring is lexicographically larger than 'largest'
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        
        return smallest + "\n" + largest;
    }
  
    public static String getSmallestAndLargestList(String s, int k) {
        Vector<String> substrings = new Vector<String>();
        
        for (int i = 0; i <= s.length() - k; i++) {
            // Add a substring of length 'k' to our list
            substrings.add( s.substring(i, i + k) );	
        }
        
        // Sort list
        Collections.sort(substrings);
        
        // Set first and last elements as smallest and largest
        String smallest = substrings.get(0);
        String largest = substrings.get(substrings.size() - 1);
        
        return smallest + "\n" + largest;
    }
    
    public static String getSmallestAndLargestArray(String s, int k) {
        // Because each substring has length 'k', we know the number of possible substrings
        String[] substrings = new String[s.length() - k + 1];
        
        for (int i = 0; i <= s.length() - k; i++) {
            // Add a substring of length 'k' to our array
            substrings[i] =  s.substring(i, i + k);	
        }
        
        // Sort array
        Arrays.sort(substrings);
        
        // Set first and last elements as smallest and largest
        String smallest = substrings[0];
        String largest = substrings[substrings.length - 1];
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargestCompareTo(s, k));
        System.out.println(getSmallestAndLargestList(s, k));
        System.out.println(getSmallestAndLargestArray(s, k));
    }
}
