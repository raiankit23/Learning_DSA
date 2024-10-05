package Assignments.Assign6Rec_BackTrack_6641;
import java.util.*;
public class Main {
    static int noOfAns;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        print(n, m, "");
        System.out.println();
        System.out.println(noOfAns);
    }
    private static void print(int n, int count, String ans){

        if(count==0){
            System.out.print(ans+" ");
            noOfAns++;
            return;
        }
        if(count<0){
            return;
        }

        for(int i=1;i<=n;i++){
            print(n, count-i, ans+i);
        }
    }
}
