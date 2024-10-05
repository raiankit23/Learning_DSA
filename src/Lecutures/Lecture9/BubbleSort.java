package Lecutures.Lecture9;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {4, 5, 3, 2, 1};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // bubble sort
    private static void sort(int[] arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

//    private static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[i+1];
//        arr[i+1] = temp;
//    }
}
