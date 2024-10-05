package Assignments.BackTracking;

public class CoinCombination {
    public static void main(String[] args) {
        int[] coin = {2, 3, 5};
        int amount = 8;
        coinCombination(coin, amount, "", 0);
    }
    private static void coinCombination(int[] coin, int amount, String ans, int idx){
        if(amount==0){
            System.out.println(ans);
            return;
        }

        for (int i = idx; i < coin.length; i++) {
            if(amount>=coin[i]){
                coinCombination(coin, amount-coin[i], ans+coin[i], i);
            }
        }
    }
}
