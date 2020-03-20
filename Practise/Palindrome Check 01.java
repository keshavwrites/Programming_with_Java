import java.util.Scanner;

public class Solution {

    static boolean isPal(String A,int start, int end){
        if(start >= end){
            return true;
        }
        return (A.charAt(start)==A.charAt(end) && 
        isPal(A,start+1,end-1));
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String ans = isPal(A,0,A.length()-1)?"Yes":"No";
        System.out.print(ans);        
    }
}
