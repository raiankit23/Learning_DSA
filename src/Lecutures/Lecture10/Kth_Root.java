package Lecutures.Lecture10;

public class Kth_Root {
    public static void main(String[] args) {
        int n = 148;
        int k = 3;
        System.out.println(kthRoot(n, k));// X^k = n find x;
    }

    private static int kthRoot(int n, int k){
        int low = 1;
        int high = n;
        int ans = 0;
        while(low<=high){
            int mid = (low + high)/2;
            if(Math.pow(mid, k)<= n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
}}
