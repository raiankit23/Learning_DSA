package Lecture5;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        int n=39;
        int sum=0;
        int mul=1; //10^0
        while (n>0){
            int rem=n%2;
            sum=sum+rem*mul;
            n=n/2;
            mul*=10;
        }
        System.out.println(sum);
    }
}
