// github.com/andy489

import java.io.*;
import java.util.*;

public class Solution {
    // Time Complexity: O(n) using a HashMap
    // Space Complexity: O(n)
    static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        HashMap<Character, Integer> map = new HashMap();
        
        /* Fill HashMap with 1st String */
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            map.merge(ch, 1, Integer::sum);
        }
        
        /* Compare 2nd String to 1st String's HashMap */
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

// Second Solution (Counting)

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        int c[] = new int[26], 
            d[] = new int[26];
        a = a.toLowerCase();
        b = b.toLowerCase();
        int i = 0,n = a.length();
        for(; i<n; ++i){
            c[a.charAt(i) - 'a']++;
            d[b.charAt(i) - 'a']++;
        }
        for(i =0;i<26; ++i)
            if(c[i] != d[i] ) return false;
        return true;
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
