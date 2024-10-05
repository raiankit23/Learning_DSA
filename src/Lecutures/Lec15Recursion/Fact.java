package Lecutures.Lec15Recursion;

public class Fact {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
    private static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fn = fact(n-1); // 4!
        return fn * n;         // 4!*5=5!
    }
    /*
    * Tail Recursion - when no task is performed while returning from call stack
    * Head Recursion - when some task is performed while ...
    * */
}
