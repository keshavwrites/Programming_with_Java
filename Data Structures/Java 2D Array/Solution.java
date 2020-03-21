// github.com/andy489

import java.util.Scanner;

public class Solution {

    private static int[] rows={0,0,0,-1,-2,-2,-2},
                         cols={0,-1,-2,-1,0,-1,-2};

    private static int curSum(int[][] a, int x, int y){
        int sum=0,i=0,n=rows.length;
        for(;i<n;++i){
            sum+=a[x+rows[i]][y+cols[i]];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[][] = new int [6][6];
        int maxSum=Integer.MIN_VALUE;
        Scanner in = new Scanner(System.in);
        int i,j,cur;
        for(i=0;i<6;++i){
            for(j=0;j<6;++j){
                a[i][j] = in.nextInt();
                if(i>1&&j>1){
                    cur=curSum(a,i,j);
                    maxSum=cur>maxSum?cur:maxSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
