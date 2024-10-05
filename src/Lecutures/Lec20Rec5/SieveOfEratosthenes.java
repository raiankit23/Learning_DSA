package Lecutures.Lec20Rec5;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=100;
        System.out.println(primeSieve(100));
    }
    private static int primeSieve(int n){
        int[] prime = new int[n+1];
        prime[0] = 1; //marked not prime
        prime[1] = 1; // marked not prime

        for(int i=2;i*i<=prime.length;i++){
            if(prime[i] == 0){
                for(int j=2;i*j<prime.length;j++){
                    prime[i*j] = 1;
                }
            }
        }
        int c=0;
        for (int i = 2; i < prime.length; i++) {
            if(prime[i]==0){
                c++;
            }
        }
        return c;
    }
}
