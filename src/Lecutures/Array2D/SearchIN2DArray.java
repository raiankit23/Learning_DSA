package Lecutures.Array2D;

public class SearchIN2DArray {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 1, 4},
                {5, 6, 7, 9},
                {8, 12, 11, 10},
                {16, 15, 14, 13}};
        System.out.println(searchIn2DArray(arr, 9));
    }

    private static boolean searchIn2DArray(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
