package Lecutures.Lec19Recursion4;


import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] coin = {1, 2, 3};
        int amount = 4;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(coin, amount, ll, 0, ans);
        System.out.println(ans);
    }
    private static void combinationSum(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans){
        if(amount == 0){
//            ans.add(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<coin.length;i++){
            if(amount>=coin[i]){
                ll.add(coin[i]);
                combinationSum(coin, amount-coin[i], ll, i, ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
