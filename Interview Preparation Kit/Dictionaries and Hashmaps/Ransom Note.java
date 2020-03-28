// github.com/andy489

import java.util.Scanner;
import java.util.HashMap;

public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
            m=in.nextInt(),i;
        HashMap<String, Integer>table = new HashMap<String,Integer>();
        String s="";
        for(i=0;i<n;++i){
            s=in.next();
            if(table.containsKey(s)){
                table.put(s,table.get(s)+1);
            }
            else{
                table.put(s,1);
            }
        }
        for(i=0;i<m;++i){
            s=in.next();
            if(!table.containsKey(s) || table.get(s)==0){
                System.out.println("No");
                return;
            } else {
                table.put(s,table.get(s)-1);
            }
        }
        System.out.println("Yes");
    }
}
