package Lecutures.Lec18Backtracking;

public class Queen_Permutation {
    public static void main(String[] args) {
        int n=4;
        boolean [] board = new boolean[n];
        int tq=2;
        Permutation(board, tq, 0, "");
    }
    private static void Permutation(boolean[] board, int totalQueen, int queenPlaceSoFar, String ans){
        if(queenPlaceSoFar==totalQueen){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<board.length;i++){
            if(board[i] == false){
                board[i]=true;
                Permutation(board, totalQueen, queenPlaceSoFar+1, ans+"b"+i+"q"+queenPlaceSoFar);
                board[i]=false;
            }
        }
    }
}
