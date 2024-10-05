package Assignments.Assign6Rec_BackTrack_6641;

import java.util.Scanner;

public class ReplaceZeroWithFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result = replaceZerosWithFives(n);
        System.out.println(result);

    }

    private static int replaceZerosWithFives(int n){
        int lastDigit = n%10;

        if(n==0){
            return 0;
        }
        if(lastDigit==0){
            lastDigit=5;
        }

        return replaceZerosWithFives(n/10)*10+lastDigit;
    }
}
