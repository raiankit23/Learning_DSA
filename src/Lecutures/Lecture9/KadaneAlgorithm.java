package Lecutures.Lecture9;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int [] arr= {2, 3, -7, 5, -1, 8};
        System.out.println(maximumSum(arr));
    }

    private static int maximumSum(int[] arr) {
        int ans = Integer.MIN_VALUE; // for updation of value
        int sum = 0;               // I need to add something everytime that's why initialise with 0
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}
