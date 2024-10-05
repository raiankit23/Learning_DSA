package Lecutures.Lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases>0){
            int nos = sc.nextInt(); // number of stall
            int noc = sc.nextInt(); // number of cows
            int [] stall = new int[nos];
            for(int i=0;i< stall.length;i++){
                stall[i] = sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(largest_minimum(stall, noc));
            testcases--;
        }

    }
    private static int largest_minimum(int [] stall, int noc){
        int low = 0;
        int high = stall[stall.length-1]-stall[0]; // 8
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isitpossible(stall, noc, mid) == true){
                ans=mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    private static boolean isitpossible(int[] stall, int noc, int distance){
        int cow = 1;
        int pos = stall[0];
        for(int i=1;i< stall.length;i++){
            if(stall[i] - pos >= distance){
                cow++;
                pos = stall[i];
            }
            if(cow==noc){
                return true;
            }
        }
        return false;
    }
}
