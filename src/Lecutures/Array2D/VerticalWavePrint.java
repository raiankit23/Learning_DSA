package Lecutures.Array2D;

public class VerticalWavePrint {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 5, 1, 7},
                        {8, 9, 11, 12, 14},
                        {15, 16, 18, 20, 21}};
        printWave(arr);
    }
    private static void printWave(int[][] arr){
        for(int col=0;col<arr[0].length;col++){
            if(col%2==0){
                for(int row=0;row<arr.length;row++){
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
            else{
                for(int row=arr.length-1;row>=0;row--){
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }

        }
    }
}
