package Assignments.Assign6Rec_BackTrack_6641;

public class BoardPathPrintandCount {
    public static void main(String[] args) {
        int n = 3;
        int[] board = {1, 2, 3};
        print(board, n, "");
        System.out.println();
        System.out.println(noOfAns);
    }

    static int noOfAns = 0;

    private static void print(int[] board, int count, String ans) {

        if (count == 0) {
            System.out.print(ans + " ");
            noOfAns++;
            return;
        }

        if (count < 0) {
            return;
        }

        for (int i = 0; i < board.length; i++) {
            print(board, count - board[i], ans + board[i]);
        }
    }
}
