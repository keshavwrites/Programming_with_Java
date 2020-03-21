// github.com/andy489

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static boolean canWinBFS(int start, int leap, int[] game){
        int n = game.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        game[start]=1;
        while(q.size()>0){
            int cur = q.peek();
            if(cur+1==n || cur+leap>=n) return true;
            q.remove();
            if(cur-1 >=0 && game[cur-1]==0) {
                q.add(cur-1);
                game[cur-1]=1;
            }
            if(cur+1 < n && game[cur+1]==0) {
                q.add(cur+1);
                game[cur+1]=1;
            }
            if(cur+1 < n && game[cur+leap]==0) {
                q.add(cur+leap);
                game[cur+leap]=1;
            }
        }
        return false;
    }

    private static boolean canWinDFS(int s, int leap, int[] arr) {
    if (s < 0 || arr[s] == 1) return false;
    if ((s == arr.length - 1) || s + leap > arr.length - 1) return true;

    arr[s] = 1; // mark as visited

    return  canWinDFS(s + leap, leap, arr) || 
            canWinDFS(s + 1, leap, arr) || 
            canWinDFS(s - 1, leap, arr);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            int i;
            for (i = 0; i < n; ++i) {
                game[i] = scan.nextInt();
            }
            System.out.println((canWinDFS(0,leap,game))?"YES":"NO");
            //System.out.println((canWinBFS(0,leap,game))?"YES":"NO");
        }
    }
}
