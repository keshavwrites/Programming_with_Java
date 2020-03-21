// github.com/andy489

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        scan.close();
        
        /* Sum lengths */
        System.out.println(A.length() + B.length());

        /* Compare lexicographical ordering */
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        /* Print the Strings in desired format */
        System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
    }
    
    private static String capFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
    }
}

//Second Solution

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "
        +B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));   
    }
}
