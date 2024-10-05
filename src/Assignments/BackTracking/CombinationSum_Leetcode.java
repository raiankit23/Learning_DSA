package Assignments.BackTracking;

import java.util.ArrayList;
import java.util.List;
// leetcode 39. CombinationSum
public class CombinationSum_Leetcode {
    public static void main(String[] args) {
        int[] coin = {2, 3, 5};
        int amount = 8;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(coin, amount, ll, 0, ans);
        System.out.println(ans);
    }

    private static void combinationSum(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans){

        if(amount==0){
//            System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if(amount>=coin[i]){
                ll.add(coin[i]);
                combinationSum(coin, amount-coin[i], ll, i, ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
