package Lecutures.Array2D;

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        //taking input
        for(int i=0;i<arr.length;i++){                // row input
            for(int j=0;j<arr[0].length;j++){            // col input
                arr[i][j] = sc.nextInt();
            }
        }
        displayArr(arr);
    }
    private static void displayArr(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
