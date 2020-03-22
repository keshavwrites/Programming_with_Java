// github.com/andy489

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int[] chararr = new int[26];

        char c = ' ';
        int cnt = 0;

        while (true) {
            c = (char) System.in.read();
            if (c == '\n') break;
            ++chararr[c - 'a'];
        }
        in.reset();
        while (true) {
            c = (char) System.in.read();
            if (c < 'a' || c > 'z') break;
            --chararr[c - 'a'];
        }
        int i;
        for (int x : chararr) {
            if (x != 0) cnt += x > 0 ? x : -x;
        }
        System.out.println(cnt);
    }
}
