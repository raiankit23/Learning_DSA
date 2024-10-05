package Assignments.SelfPractise;

import java.util.Scanner;

public class ChewbaccaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.print(changeNum(num));
    }

    private static long changeNum(long num) {
        long result = 0;
        long multiplier = 1;
        boolean isFirstDigit = true;
        while (num > 0) {
            long digit = num % 10;
            long chewbaccaDigit = 9 - digit;
            if (chewbaccaDigit < digit && !(isFirstDigit && chewbaccaDigit == 0)) {
                digit = chewbaccaDigit;
            }

            result = result + digit * multiplier;
            multiplier *= 10;
            num /= 10;
        }
        return result;
    }
}


