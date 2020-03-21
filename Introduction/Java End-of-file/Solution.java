// github.com/andy489

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lineNo=1;
        while(in.hasNextLine()){
            System.out.println(lineNo+++" "+in.nextLine());
        }
    }
}
