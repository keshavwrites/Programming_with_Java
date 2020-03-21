// github.com/andy489

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while (testCases > 0) {
         String username = in.nextLine();
         String pattern = "^[a-zA-Z]\\w{7,29}$";
         
         Pattern r = Pattern.compile(pattern);
         Matcher m = r.matcher(username);
          
         if (m.find()) {
            System.out.println("Valid");
         } else {
            System.out.println("Invalid");
         }
         testCases--;
      }
   }
}

//Second Solution

import java.util.Scanner;
class UsernameValidator {
    public static String regularExpression = 
    "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
