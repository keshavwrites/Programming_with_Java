-- github.com/andy489

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class comp implements Comparator<String>{
    public int compare(String s1, String s2){
        int lenDiff = s1.length()-s2.length();
        if(lenDiff!=0) return lenDiff;
        return s1.compareTo(s2);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), i;
        String[] arr = new String[n];
        for (i = 0; i < n; ++i) {
            arr[i]=in.next();
        }
        Arrays.sort(arr,new comp());
        for(String s: arr) {
            System.out.println(s);
        }
    }
}

// Second Solution

import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), i;
        String[] arr = new String[n];
        for (i = 0; i < n; ++i) {
            arr[i]=in.next();
        }
        Arrays.sort(arr);
        Arrays.sort(arr,(s1,s2)->(s1.length()-s2.length()));
        for(String s: arr){
            System.out.println(s);
        }
    }
}
