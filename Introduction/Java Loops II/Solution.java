// github.com/andy489

import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                a += b * (int) Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

//Second Solution

import java.util.*;

class Solution{
    
    static int calc(int a, int b, int n){
        int res = a;
        while(n-->=0){
            res+=b*(int)Math.pow(2,n);
        }
        return res;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int j=1;
            for(;j<=n;++j){
                System.out.printf("%d ",calc(a,b,j));
            }
            System.out.println();
        }
        in.close();
    }
}
