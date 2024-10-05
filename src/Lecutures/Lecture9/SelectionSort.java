package Lecutures.Lecture9;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, -1, 5, 7, 3, -2, 1};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int mini = min_from_ith_index(arr, i);
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }

    private static int min_from_ith_index(int[] arr, int i) {
        int mini = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[mini]) {
                mini = j;
            }
        }
        return mini;
    }
}
