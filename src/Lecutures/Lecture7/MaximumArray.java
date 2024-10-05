package Lecutures.Lecture7;

public class MaximumArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        System.out.println(Max_Value(arr));
    }
    private static int Max_Value(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

                max = Math.max(max, arr[i]);

        }
        return max;
    }
}
