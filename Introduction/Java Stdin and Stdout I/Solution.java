// github.com/andy489

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        
        /* Print data */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

//Second Solution

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(),
        b = scan.nextInt(),
        c= scan.nextInt();
        
        System.out.printf("%d%n%d%n%d%n",a,b,c);
    }
}
