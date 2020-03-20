//https://www.hackerrank.com/challenges/java-anagrams/problem

//First Solution
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

//Second Solution
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        if (a == null || b == null || a.equals("") || b.equals(""))
            throw new IllegalArgumentException();

        if (a.length() != b.length()) return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        java.util.Map<Character, Integer> map = new java.util.HashMap<>();

        int i = 0, n = a.length();
        for (; i < n; ++i) {
            char letter = a.charAt(i);

            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                int frequency = map.get(letter);
                map.put(letter, ++frequency);
            }
        }

        for (i = 0; i < n; ++i) {
            char letter = b.charAt(i);

            if (!map.containsKey(letter)) return false;

            int frequency = map.get(letter);

            if (frequency == 0) return false;
            else map.put(letter, --frequency);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
