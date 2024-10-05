package Assignments.BackTracking;

public class QueenPermutation {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int totalQueen = 2;

        permutation(board, totalQueen, "", 0);
    }

    private static void permutation(boolean[] board, int totalQueen, String ans, int queenPlacedSoFar) {

        if (queenPlacedSoFar == totalQueen) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                permutation(board, totalQueen, ans + "b" + i + "q" + queenPlacedSoFar, queenPlacedSoFar+1);
                board[i] = false;
            }
        }
    }

}
