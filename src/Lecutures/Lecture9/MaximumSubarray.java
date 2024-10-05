package Lecutures.Lecture9;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSum(arr));
    }

    private static int maximumSum(int[] arr){
        int ans = Integer.MIN_VALUE; // for updation of value
        for(int i=0;i<arr.length;i++){
            int sum=0;               // to change its value not updation
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                ans= Math.max(ans, sum);
            }
        }
        return ans;
    }
}
