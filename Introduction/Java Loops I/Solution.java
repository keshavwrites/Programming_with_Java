// github.com/andy489

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplier = scan.nextInt();
        scan.close();
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d%n", multiplier, i , i * multiplier);
        }
    }
}

//Second Solution

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i=1;
        for(;i<11;++i){
            System.out.println(N+" x "+i+" = "+i*N);
        }
    }
}
