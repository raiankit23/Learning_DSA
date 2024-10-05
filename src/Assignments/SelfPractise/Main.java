package Assignments.SelfPractise;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        spiralClockWisePrint(arr);
    }

    private static void spiralClockWisePrint(int[][] arr) {
        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length - 1;
        int maxcol = arr[0].length - 1;
        int totalElement = arr.length * arr[0].length;
        int count = 0;

        while (count < totalElement) {
            for (int i = mincol; i <= maxcol && count < totalElement; i++) {
                System.out.print(arr[minrow][i] + ", ");
                count++;
            }
            minrow++;
            for (int i = minrow; i <= maxrow && count < totalElement; i++) {
                System.out.print(arr[i][maxcol] + ", ");
                count++;
            }
            maxcol--;
            for (int i = maxcol; i >= mincol && count < totalElement; i--) {
                System.out.print(arr[maxcol][i] + ", ");
                count++;
            }
            maxrow--;
            for (int i = maxrow; i >= minrow && count < totalElement; i--) {
                System.out.print(arr[i][mincol] + ", ");
                count++;
            }
            mincol++;
        }
        System.out.print("END");
    }
}