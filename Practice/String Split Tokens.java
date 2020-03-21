//https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens = s.trim().split("[ !,?._'@]+");

        if (s == null || s.trim().equals("")) {
            System.out.println("0");
        } else if (s.length() > 400000) {
            return;
        } else {
            System.out.println(tokens.length);
        }
        for (String item : tokens) {
            System.out.println(item);
        }
        scan.close();
    }
}
