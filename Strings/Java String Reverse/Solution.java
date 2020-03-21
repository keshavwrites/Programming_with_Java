
// github.com/andy489

import java.util.Scanner;

public class Solution {

    //First Approach
    static boolean isPal1(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        return (str.charAt(start) == str.charAt(end) &&
                isPal(str, start + 1, end - 1));
    }
    
    //Second Approach
    static boolean isPal(String str) {
        return new StringBuilder(str).reverse().toString()
                .compareTo(str) == 0;
    }
    
    //Third Approach
    static boolean isPal(String str) {
        int i = 0, n = str.length();
        for (; i < n / 2; ++i) {
            if (str.charAt(i) != str.charAt(n - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String ans = isPal(str, 0, str.length() - 1) ? "Yes" : "No";
        System.out.print(ans);
    }
}
