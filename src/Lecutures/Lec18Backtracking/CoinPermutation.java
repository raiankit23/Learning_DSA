package Lecutures.Lec18Backtracking;

public class CoinPermutation {
    public static void main(String[] args) {
        int[] coin = {1, 2, 3};
        int amount = 4;
        cointPermutation(coin, amount, "");
    }
    private static void cointPermutation(int[] coin, int amount, String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < coin.length ; i++) {
            if(amount>=coin[i]){
                cointPermutation(coin, amount-coin[i], ans+coin[i]);
            }
        }
    }
}
