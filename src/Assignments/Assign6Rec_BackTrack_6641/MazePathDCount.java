package Assignments.Assign6Rec_BackTrack_6641;

import java.util.Scanner;

public class MazePathDCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        printPath(arr, "");
    }
    private static void printPath(int[][] arr, String ans){

        printPath(arr, ans+"V");
    }
}
