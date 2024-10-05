package Assignments.SelfPractise;

public class BostonNumber {
    public static void main(String[] args) {
        int num = 378;
        System.out.println(isBostonNumber(num));
    }
    private static int isBostonNumber(int num) {
        int originalNum = num;

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        num = originalNum;
        int primeSum = 0;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                primeSum += digitSum(i);
                num /= i;
            }
        }

        if (primeSum == sum) {
            return 1;
        }
        return 0;
    }
    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}


