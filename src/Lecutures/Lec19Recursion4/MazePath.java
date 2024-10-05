package Lecutures.Lec19Recursion4;

public class MazePath {
    public static void main(String[] args) {
        int n=3; // row
        int m=3; // column
        printPath(0, 0, n-1, m-1, "");
    }
    private static void printPath(int currRow, int currCol, int endRow, int endCol, String ans){
        if(currRow==endRow && currCol == endCol){
            System.out.println(ans);
            return;
        }
        if(currRow>endRow || currCol>endCol){
            return;
        }

        printPath(currRow, currCol+1, endRow, endCol, ans+"H");
        printPath(currRow+1, currCol, endRow, endCol, ans+"V");

    }
}
