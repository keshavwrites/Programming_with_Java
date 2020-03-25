// github.com/andy489

package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    private static Random rand = new Random();
    private static int partition(int[] arr, int start, int end) {
        int pivotIndex = rand.nextInt(end-start+1)+start;
        arr[pivotIndex] += arr[end] - (arr[end] = arr[pivotIndex]);
        int pivot = arr[end];
        pivotIndex = start;
        int i;
        for (i = start; i < end; ++i) {
            if (arr[i] < pivot) {
                arr[pivotIndex] += arr[i] - (arr[i] = arr[pivotIndex]);
                ++pivotIndex;
            }
        }
        arr[pivotIndex] += arr[end] - (arr[end] = arr[pivotIndex]);
        return pivotIndex;
    }

    private static int kthSmallestRecursive(int[] arr, int start, int end, int k) {
        int pivotIndex = partition(arr,start,end);
        if(pivotIndex<k){
            kthSmallestRecursive(arr, pivotIndex + 1, end, k);
        }
        else if(pivotIndex>k){
            return kthSmallestRecursive(arr,start,pivotIndex-1,k);
        }
        return arr[k];
    }

    private static int kthSmallestIterative(int[] arr,int start, int end,int k){
        while(start<=end){
            int pivotIndex=partition(arr,start,end);
            if(pivotIndex<k){
                start=pivotIndex+1;
            }
            else if(pivotIndex>k){
                end = pivotIndex-1;
            }
            else return arr[k];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }
        in.nextLine();
        String line=in.nextLine();
        while(!line.equalsIgnoreCase("end")){
            int k = Integer.parseInt(line);
            if(k<1||k>n){
                System.out.println("Index "+k+" is out of bounds!");
                line=in.nextLine();
                continue;
            }
            int ans=kthSmallestIterative(arr,0,n-1,k-1);
            System.out.println(k+"-th smallest element is "+ans);
            line=in.nextLine();
        }
    }
}
