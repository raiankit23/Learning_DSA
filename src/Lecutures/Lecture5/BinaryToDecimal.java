package Lecutures.Lecture5;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int n=1100011101;
        int sum=0;
        int mul=1; //10^0
        while (n>0){
            int rem=n%10;
            sum=sum+rem*mul;
            n=n/10;
            mul*=2;
        }
        System.out.println(sum);
    }
}
