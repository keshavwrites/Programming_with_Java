
// github.com/andy489

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if((N&1)==1){
            System.out.println("Weird");
        }
        else if (N>=2 && N<=5){
            System.out.println("Not Weird");
        }
        else if(N>=6 &&N<=20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}

//Second Solution

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        /* Determine answer */
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if (n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        
        /* Print output */
        System.out.println(ans);
    }
}
