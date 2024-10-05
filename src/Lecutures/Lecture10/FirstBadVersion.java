package Lecutures.Lecture10;

public class FirstBadVersion {
    public static void main(String[] args) {

    }
    private int firstBadVersion(int n){
        int low = 1;
        int high = n;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isBadVersion(mid) == true){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    // writing mock function it has to be done on leetcode
    private static boolean isBadVersion(int mid){
        return true;
    }
}
