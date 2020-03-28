// github.com/andy489

import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),i;
        int a[] = new int[n+1];
        for(i=1;i<=n;++i){
            a[i]=in.nextInt();
        }
        int cnt=0;
        for(i=1;i<=n;++i){
            if(a[i]!=i){
                int j=i;
                while(a[j]!=j){
                    a[a[j]]+=a[j]-(a[j]=a[a[j]]);
                    ++cnt;
                    j=a[j];
                }
            }
        }
        System.out.println(cnt);
    }
}
