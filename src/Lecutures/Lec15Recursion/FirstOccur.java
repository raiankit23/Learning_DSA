package Lecutures.Lec15Recursion;

public class FirstOccur {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 4, 5, 4, 5, 4};
        int item = 4;
        System.out.println(Index(arr, item, 0));
    }

    private static int Index(int[] arr, int item, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == item) {
            return i;
        }
        return Index(arr, item, i + 1);


    }
}
