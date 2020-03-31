// github.com/andy489

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            int ans = 0;
            HashMap<String, Integer> h = new HashMap();
            String s = in.nextLine();
            int len = s.length(),i,j;
            for(i=0;i<len;++i){
                for(j=1;j<=len-i;++j){
                    String sub = s.substring(i,i+j);
                    char temp[] = sub.toCharArray();
                    Arrays.sort(temp);
                    String sToMap=new String(temp);
                    if(h.containsKey(sToMap)){
                        h.put(sToMap,h.get(sToMap)+1);
                    } else {
                        h.put(sToMap,1);
                    }
                }
            }
            for(String key:h.keySet()){
                int count = h.get(key);
                if(count>1){
                    ans+=(count*(count-1))/2;
                }
            }
            System.out.println(ans);
        }
    }
}
