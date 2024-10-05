package Assignments.Assignment2;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long result = replaceDigit(num);
        System.out.println(result);
    }

    private static long replaceDigit(long num) {
        // Handle the special case when the input number is 0
        if (num == 0) {
            return 5;
        }

        long helpingNum = 0;
        long multiplier = 1;

        while (num > 0) {
            long digit = num % 10;
            if (digit == 0) {
                digit = 5;
            }
            helpingNum += digit * multiplier;
            multiplier *= 10;
            num /= 10;
        }

        return helpingNum;

    }
}
