package Assignments.RecPractise2;

public class CountBoardPath {
    public static void main(String[] args) {
        int targetSum = 3;
        System.out.println(printAns(targetSum, 0, ""));
    }
    private static int printAns(int n, int curr, String ans){

        if(curr==n){
            return 1;
        }
        if(curr>n){
            return 0;
        }
        int count = 0;
        for (int dice = 1; dice <= n; dice++) {
            count+= printAns(n, curr+dice, ans+dice);
        }
        return count;
    }
} 
