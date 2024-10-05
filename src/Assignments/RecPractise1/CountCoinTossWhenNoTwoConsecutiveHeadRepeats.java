package Assignments.RecPractise1;

public class CountCoinTossWhenNoTwoConsecutiveHeadRepeats {
    public static void main(String[] args) {
        int n=3;
        System.out.println(countCoinToss2(n, ""));
    }

    private  static  int countCoinToss2(int n, String ans){
        int a = 0;

        if(n==0){
            System.out.println(ans);
            return 1;
        }

        if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H'){
            a = countCoinToss2(n-1, ans+"H");
        }
        int b = countCoinToss2(n-1, ans+"T");

        return a+b;
    }
}
