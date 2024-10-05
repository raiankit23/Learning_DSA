package Lecutures.Lecture6;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Inverse(n));
    }
    public static int Inverse(int n){
        int sum=0;
        int pos=1;
        while (n>0){
            int rem = n%10;
//            sum = sum+pos*Math.pow(10, rem-1));
            sum += pos* Math.pow(10, rem-1);
            pos++;
            n=n/10;
        }
        return sum;
    }
}
