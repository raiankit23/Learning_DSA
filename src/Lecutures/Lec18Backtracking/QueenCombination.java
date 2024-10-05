package Lecutures.Lec18Backtracking;

public class QueenCombination {
    public static void main(String[] args) {
        int n=4;
        boolean [] board = new boolean[n];
        int tq=2;
        combination(board, tq, 0, "", 0);
    }
    private static void combination(boolean[] board, int totalQueen, int queenPlaceSoFar, String ans, int index){
        if(queenPlaceSoFar==totalQueen){
            System.out.println(ans);
            return;
        }

        for(int i=index;i<board.length;i++){
            if(board[i] == false){
                board[i]=true;
                combination(board, totalQueen, queenPlaceSoFar+1, ans+"b"+i+"q"+queenPlaceSoFar, index+1);
                board[i]=false;
            }
        }
    }
}
