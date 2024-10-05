package Lecutures.Lec17Recursion3;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> ll = new ArrayList<>();
        generateParantheses(n, 0, 0, "", ll);
        System.out.println(ll);

    }
    private static void generateParantheses(int n, int open, int close, String ans, List<String> ll){

        if(open == n && close == n){
//            System.out.println(ans);
            ll.add(ans);
            return;
        }
        if(open>n || close>open){
            return;
        }

        generateParantheses(n, open+1, close, ans +"(", ll);
        generateParantheses(n, open, close+1, ans +")", ll);
//        generateParantheses(n, open+1, close, ans +"(");
    }
}
