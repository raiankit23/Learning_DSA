package Lecutures.Lec22Divide_Conquer;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 4, 1};
        int [] result = sortTheArray(arr, 0, arr.length-1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    private static int[] sortTheArray(int []arr, int low, int high){

        if(low==high){
            int[] b = new int[1];
            b[0] = arr[low];
            return b;
        }

        int mid = (low+high)/2;
        int[] firstArray=sortTheArray(arr, low, mid);
        int[] secondArray=sortTheArray(arr, mid+1, high);
        return mergeTwoSortedArray(firstArray, secondArray);
    }

    private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int [] ans = new int[m+n];
        int i=0, j=0, k=0;

        while (i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i<n){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j<m){
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
