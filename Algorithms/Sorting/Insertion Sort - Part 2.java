// github.com/andy489

// Slow O(n*n)

import java.util.Scanner;

public class Solution {
    private static int getItself(int itself, int dummy) {
        return itself; //a += (b - (b = a));
    }

    private static void display(int n, int[] arr){
        int i;
        for(i=0;i<n;++i){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
    }

    private static void insertionSort2(int n, int[] arr) {
        int i;
        for (i = 1; i < n; ++i) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {
                arr[j] = getItself(arr[j-1],arr[j-1]=arr[j]);
                // arr[j] += (arr[j-1]-(arr[j-1] = arr[j]));
                --j;
            }
            display(n,arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), i;
        int[] arr = new int[n];
        for (i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }
        insertionSort2(n,arr);
    }
}
