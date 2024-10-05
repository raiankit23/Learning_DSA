package Lecutures.Lecture9;

public class PreInsertionSort {
    public static void main(String[] args) {
        int [] arr = {1, 2, 7, 8, 9, 11, 5};

        insertLastElement(arr, arr.length-1);{
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    private static void insertLastElement(int[] arr, int i){
        int item = arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>item){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = item;
    }
}
