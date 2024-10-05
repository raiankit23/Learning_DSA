package Assignments.RecPractise1;

public class NoTwoConsecutiveHead {
    public static void main(String[] args) {
        int n=3;
        noTwoConsecutiveHead(n, "");

    }
    private static void noTwoConsecutiveHead(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length() == 0 || ans.charAt(ans.length()-1) != 'H'){
            noTwoConsecutiveHead(n-1, ans+"H");
        }
        noTwoConsecutiveHead(n-1, ans+"T");
    }
}
