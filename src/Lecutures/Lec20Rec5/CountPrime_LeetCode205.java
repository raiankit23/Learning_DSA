package Lecutures.Lec20Rec5;

public class CountPrime_LeetCode205 {
    public static void main(String[] args) {
        int n=687;
    }
    private static boolean isPrime(int n){
        int div=2;
        while (div*div<=n){
            if(n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
}
