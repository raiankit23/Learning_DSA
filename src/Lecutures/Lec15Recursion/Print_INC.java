package Lecutures.Lec15Recursion;

public class Print_INC {
    public static void main(String[] args) {
        int n= 5;
        PI(n);
    }
    private static void PI(int n){
        if(n==0){
            return;
        }
        PI(n-1);
        System.out.println(n);
    }
}
