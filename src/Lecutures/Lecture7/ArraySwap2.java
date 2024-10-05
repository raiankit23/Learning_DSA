package Lecutures.Lecture7;

public class ArraySwap2 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 6, 7, 8};
//        int [] arr1 = new int[] {10, 20, 6, 7, 19, 11};
// yet another way to declare array, we have 4 ways of declaring array
        System.out.println(arr.length);
        System.out.println(arr[0] +" "+arr[1]); // 10 20
        Swap(arr,0, 1);
        System.out.println(arr[0]+" "+arr[1]);
    }
    private static void Swap(int[] arr, int i, int j){
        int c = i;
        i=j;
        j=c;
    }
}
