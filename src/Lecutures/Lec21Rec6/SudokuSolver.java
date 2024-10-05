package Lecutures.Lec21Rec6;

public class SudokuSolver {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        printGrid(grid, 0, 0);
    }

    private static void printGrid(int[][] grid, int row, int col){

        if(col == grid[0].length){
            row++;
            col = 0;
        }
        if(row == grid.length){
            displayGrid(grid);
            return;
        }

        if(grid[row][col]!=0){
            printGrid(grid, row, col+1);
        }
        else {
            for (int val = 1; val <= 9; val++) {
                if(isSafe(grid, row, col, val)){
                    grid[row][col] = val;
                    printGrid(grid, row, col+1);
                    grid[row][col] = 0;
                }
            }
        }
    }

    private static boolean isSafe(int[][] grid, int row, int col, int val){
        // checking row
        for (int c = 0; c < grid.length; c++) {
            if(grid[row][c] == val){
                return false;
            }
        }
        // checking column
        for (int r = 0; r < grid.length; r++) {
            if(grid[r][col] == val){
                return false;
            }
        }
        // checking 3*3 matrix
        int r = row-row%3;
        int c = col-col%3;
        for (int i = r; i < r+3; i++) {
            for (int j = c; j < c+3; j++) {
                if(grid[r][c]==val){
                    return false;
                }
            }
        }
        return true;
    }

    private static void displayGrid(int[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
