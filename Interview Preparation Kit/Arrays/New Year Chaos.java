// github.com/andy489

import java.util.Scanner;

public class Solution {
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] a) {
        int n=a.length,i,j,ans=0;;
        for(i=n-1;i>=0;i--){
            if(a[i]-(i+1)>2){
                System.out.println("Too chaotic");
                return;
            }
            for(j=Math.max(0,a[i]-2);j<i;++j){
                if(a[j]>a[i]) ++ans;
            }
        }
        System.out.println(ans);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(t-->0) {
            int n = scanner.nextInt(),i;
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }
            minimumBribes(a);
        }
        scanner.close();
    }
}
