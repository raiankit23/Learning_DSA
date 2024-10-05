package Lecutures.Lec22Divide_Conquer;

import java.util.Random;

public class RandomiseQuickSort {
    public static void main(String[] args) {
        int[] arr={5, 7, 3, 2, 4, 1};
        randomiseQuickSort(arr, 0, arr.length-1);
//        for (int i = 0; i < ; i++) {
//
//        }

    }

    private static void randomiseQuickSort(int[] arr, int startIndex, int endIndex){
//        int low=10;
//        int high=100;
        Random randomNum = new Random();
        int ii=randomNum.nextInt(endIndex-startIndex)+startIndex;
        int t=arr[endIndex];
        arr[endIndex] = arr[endIndex];
        arr[ii] = t;
//        for (int i = 0; i < 10; i++) {
//            int v = randomNum.nextInt(high-low)+low;
//            System.out.println(v);
//        }
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
