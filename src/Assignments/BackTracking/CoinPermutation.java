package Assignments.BackTracking;

public class CoinPermutation {
    public static void main(String[] args) {
        int [] coin = {2, 3, 5};
        int amount = 8;
        permutationOfCoin(coin, amount, "");
    }
    // permutation me backTracking nhi lagega
    private static void permutationOfCoin(int [] coin, int amount, String ans){

        if(amount==0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < coin.length; i++) {
            if(amount>=coin[i]){
                permutationOfCoin(coin, amount-coin[i], ans+coin[i]);
            }
        }
    }
}
