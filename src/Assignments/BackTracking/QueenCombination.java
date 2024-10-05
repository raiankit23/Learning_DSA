package Assignments.BackTracking;

public class QueenCombination {
    public static void main(String[] args) {
        int n=4;
        boolean [] board = new boolean[n];
        int totalQueen = 2;

        combinationQueen(board, totalQueen, "", 0, 0);
    }

    /*
    * repetation is not allowed in combination
    * */
    private static void combinationQueen(boolean[] board, int totalQueen, String ans, int qpsf, int idx){

        if(totalQueen==qpsf){
            System.out.println(ans);
            return;
        }

        for (int i = idx; i < board.length; i++) {
            if(board[i]==false){
                board[i]=true;
                combinationQueen(board, totalQueen, ans+"q"+i+"b"+qpsf, qpsf+1, i+1);
                board[i]=false;
            }

        }
    }
}
