package Lecutures.Lec20Rec5;

import java.util.ArrayList;
import java.util.List;

/// need to correct this later

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        List<List<String>> ans = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        partitioning(ques, ll, ans);
        System.out.println(ans);
    }

    private static void partitioning(String ques, List<String> ll, List<List<String>> ans) {

        if (ques.length() == 0) {
            ans.add(new ArrayList<>(ll));
//            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if(isPalindrom(s)){
                ll.add(s);
                partitioning(ques.substring(i), ll, ans);
                ll.remove(ll.size()-1);
            }
        }
    }

    private static boolean isPalindrom(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
