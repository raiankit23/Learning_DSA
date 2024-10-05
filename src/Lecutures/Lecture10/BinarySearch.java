package Lecutures.Lecture10;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 9, 11, 13, 14, 15, 18, 20, 21};
        int item = 13;
        System.out.println(binarySearch(arr, item));
    }

    private static int binarySearch(int [] arr, int item){
        int low = 0;
        int high = arr.length -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == item){
                return mid;
            } else if (arr[mid]<item) {
                low = mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
}
