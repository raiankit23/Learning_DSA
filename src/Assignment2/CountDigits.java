package Assignment2;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble(); // num = 5433231
        int digit=sc.nextInt(); // n = 3

        System.out.println(countDigit(num, digit));

    }

    private static int countDigit(double num, int n){

        int count = 0;
        int digit = 0;
        while (num>0){
            digit = (int)num%10;
            if(n==digit){
                count++;
            }
            num /=10;
        }
        return count;
    }
}
