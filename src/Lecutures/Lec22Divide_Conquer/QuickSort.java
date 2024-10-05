package Lecutures.Lec22Divide_Conquer;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5, 7, 3, 2, 4, 1};

    }

    private static void quickSort(int[] arr, int startIndex, int endIndex){

        int idx = partitioning(arr, startIndex, endIndex);
    }
    private static int partitioning(int[] arr, int si, int ei){
        int item = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if(arr[i]<item){
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        int temp = arr[idx];
        arr[idx] = arr[ei];
        arr[ei] = temp;
        return idx;
    }
}
