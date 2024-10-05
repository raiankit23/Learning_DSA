package Assignments.RecPractise1;

public class CountCoinToss {
    public static void main(String[] args) {
        int n=3;
        System.out.println(countCoinToss(n, ""));
    }
    private static int countCoinToss(int n, String ans){

        if(n==0){
            System.out.println(ans);
            return 1;
        }

        int a = countCoinToss(n-1, ans+"H");
        int b = countCoinToss(n-1, ans+"T");

        return a+b;
    }
}
