package Assignments.Assignment2;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(reverseNum(num));
    }
    private static long reverseNum(long num){
        long result=0l;
        int digit = 0;
        while (num>0){
            digit =(int) num % 10;
            result = result*10 + digit;
            num /=10;
        }

        return result;

    }
}
