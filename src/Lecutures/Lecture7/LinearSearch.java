package Lecutures.Lecture7;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr={3, 5, 6, 2, 4, 16, 7, 8, 9};
        int item = 9;
        System.out.println(Search(arr, item));
    }
    private static int Search(int[] arr, int item){
        int count=-1;
        for(int i=0; i< arr.length; i++){
            if(item == arr[i]){
                count = i;
                break;
            }else {
                count = -1;
            }
        }
        return count;
    }
}
