// github.com/andy489

import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();    
        tLoop: while(t-->0){
            String a=in.next(),
                   b=in.next();
            boolean[] alpha = new boolean[26];

            for (char c : a.toCharArray()) {
                alpha[c-'a'] = true;
            }
            for (char c : b.toCharArray()) {
                if (alpha[c - 'a']) {
                    System.out.println("YES");
                    continue tLoop;
                }
            }
            System.out.println("NO");
        }
        in.close();
    }
}
