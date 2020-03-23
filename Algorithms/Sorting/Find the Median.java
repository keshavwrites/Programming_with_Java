// github.com/andy489

import java.util.Scanner;

public class Solution {

    private static int partition(int[] arr, int s, int e) {
        int randIndx = s + (int) (Math.random() * ((e - s) + 1));
        arr[randIndx] += arr[e] - (arr[e] = arr[randIndx]);
        int piv = arr[e],
                pivIndx = s,
                i;
        for (i = s; i <= e; ++i) {
            if (arr[i] < piv) {
                arr[i] += arr[pivIndx] - (arr[pivIndx] = arr[i]);
                ++pivIndx;
            }
        }
        arr[e] += arr[pivIndx] - (arr[pivIndx] = arr[e]);
        return pivIndx;
    }

    private static int quickSelect(int[] arr, int s, int e, int target) {
        int partition = partition(arr, s, e);
        if (partition == target) {
            return arr[partition];
        } else if (partition < target) {
            return quickSelect(arr, partition + 1, e, target);
        } else {
            return quickSelect(arr, s, partition - 1, target);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int i = 0;
        for (; i < n; ++i) {
            arr[i] = in.nextInt();
        }
        int median = quickSelect(arr, 0, n - 1, n / 2);
        System.out.println(median);
    }
}
