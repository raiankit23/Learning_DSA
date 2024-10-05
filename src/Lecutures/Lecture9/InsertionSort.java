package Lecutures.Lecture9;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 7, 11, 9, 5};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insertLastElement(arr, i);
        }
    }

    private static void insertLastElement(int[] arr, int i) {
        int item = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > item) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = item;
    }
}
