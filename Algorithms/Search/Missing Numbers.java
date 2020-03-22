// github.com/andy489

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int MAXN = 10001;
        int[] counting = new int[MAXN];

        int n1 = in.nextInt(), i;
        for (i = 0; i < n1; ++i) {
            ++counting[in.nextInt()];
        }
        int n2 = in.nextInt();
        for (i = 0; i < n2; ++i) {
            --counting[in.nextInt()];
        }
        for (i = 0; i < MAXN; ++i) {
            if (counting[i] < 0) {
                System.out.print(i + " ");
            }
        }
    }
}
