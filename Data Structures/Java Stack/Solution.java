// github.com/andy489

import java.util.Scanner;
import java.util.ArrayDeque;

// ArrayDeque is "likely to be faster than Stack when used as a stack" - Java documentation

class Solution {
    private static boolean isPair(Character l, Character r){
        return (l=='(' && r==')')||
               (l=='[' && r==']')||
               (l=='{' && r=='}');
    }

    private static boolean isBalanced(String exp) {
        ArrayDeque<Character> S = new ArrayDeque<Character>(); // use deque as a stack
        int i;
        for (i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
            if(c=='('||c=='['||c=='{') S.add(c);
            else{
                if(S.size()==0||!isPair(S.pollLast(),c)) return false;
            }
        }
        return S.size()==0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String exp = scan.next();
            boolean ans = isBalanced(exp);
            System.out.println(ans);
        }
        scan.close();
    }
}
