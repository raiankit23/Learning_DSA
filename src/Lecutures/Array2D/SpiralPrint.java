package Lecutures.Array2D;

public class SpiralPrint {
    public static void main(String[] args) {
    int[][] arr = {{2, 3, 1, 4},
            {5, 6, 7, 9},
            {8, 12, 11, 10},
            {16, 15, 14, 13}};

        spiralPrint(arr);
    }
    private static void spiralPrint(int[][] arr){
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int totalElement = arr.length * arr[0].length;
        int count = 0;
        while (count<totalElement){
        for(int i=minc;i<=maxc && count<totalElement;i++){
            System.out.print(arr[minr][i]+" ");
            count++;
        }
        minr++;
        for(int i=minr;i<=maxr && count<totalElement;i++){
            System.out.print(arr[i][maxc]+" ");
            count++;
        }
        maxc--;
        for(int i=maxc;i>=minc && count<totalElement;i--){
            System.out.print(arr[maxc][i]+" ");
            count++;
        }
        maxr--;
        for(int i=maxr;i>=minr && count<totalElement;i--){
            System.out.print(arr[i][minc]+" ");
            count++;
        }
        minc++;
    }}
}
