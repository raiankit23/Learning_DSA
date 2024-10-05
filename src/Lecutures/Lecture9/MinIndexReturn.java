package Lecutures.Lecture9;

public class MinIndexReturn {
    public static void main(String[] args) {
        int [] arr = {4, -1, 5, 7, 3, -2, 1};
        System.out.println(min_form_ith_index(arr, 2));
    }
    private  static  int min_form_ith_index(int [] arr, int i) {
        int mini = i;
        for (int j=i+1; j<arr.length;j++){
            if(arr[j] < arr[mini]){
                mini = j;
            }
        }
        return mini;
    }
}
