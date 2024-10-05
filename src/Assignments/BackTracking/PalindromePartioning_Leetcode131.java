package Assignments.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning_Leetcode131 {
    public static void main(String[] args) {
        String ques = "nitin";
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partitioning(ques, ll, ans);
        System.out.println(ans);
    }

    private static void partitioning(String ques, List<String> ll, List<List<String>> ans) {

        if (ques.length() == 0) {
//            System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (isPalindrome(s)) {
                ll.add(s);
                partitioning(ques.substring(i), ll, ans);
                ll.remove(ll.size()-1);
            }

        }
    }

    private static boolean isPalindrome(String str) {
        int lo = 0;
        int hi = str.length() - 1;
        while (lo < hi) {
            if (str.charAt(lo) != str.charAt(hi)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
}
