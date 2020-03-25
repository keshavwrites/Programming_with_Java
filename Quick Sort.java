package com.company;

import java.util.Scanner;

public class Main {

    private static int partition(int[] arr, int start, int end) {
        int pivotIndex = (start+end)/2;
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

    private static void quickSortRecursive(int[] arr, int start, int end) {
        if(start<end){
            int pivotIndex=partition(arr,start,end);
            quickSortRecursive(arr,start,pivotIndex-1);
            quickSortRecursive(arr,pivotIndex+1,end);
        }
    }

    private static void quickSortIterative(int[] arr,int start, int end){
        int[] stack = new int[end-start+1];
        int top = -1;
        stack[++top] = start;
        stack[++top] = end;
        while (top>=0){
            end=stack[top--];
            start=stack[top--];
            int pivotIndex = partition(arr,start,end);
            if(pivotIndex-1>start){
                stack[++top]=start;
                stack[++top]=pivotIndex-1;
            }
            if(pivotIndex+1<end){
                stack[++top]=pivotIndex+1;
                stack[++top]=end;
            }
        }
    }

    private static void print(int[] arr){
        for(int element : arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }
        quickSortIterative(arr,0,n-1);
        //quickSortRecursive(arr, 0,n-1);
        System.out.println("Sorted array: ");
        print(arr);
    }
}
