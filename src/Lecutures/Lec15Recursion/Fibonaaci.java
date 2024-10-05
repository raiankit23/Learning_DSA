package Lecutures.Lec15Recursion;

public class Fibonaaci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonaaci(n));
    }
    private static int fibonaaci(int n){
       /* if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }*/

        if(n==0 || n==1){
            return n;
        }
        int f1 = fibonaaci(n-1);
        int f2 = fibonaaci(n-2);

        return f1 + f2;
    }
}
