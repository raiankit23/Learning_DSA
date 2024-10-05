package Lecutures.Lecture6;

import java.util.Scanner;

public class ArmStrong_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Is_Armstrong(n));

    }

    public static boolean Is_Armstrong(int n) {
        int c = countOfDigit(n);
        int val=n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, c));
            n = n / 10;
        }
        if (sum == val) {
            return true;
        } else {
            return false;
        }
    }

    public static int countOfDigit(int n) {
        int counter = 0;
        while (n > 0) {
            n = n / 10;
            counter++;
        }
        return counter;
    }
}
