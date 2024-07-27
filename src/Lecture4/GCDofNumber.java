package Lecture4;

public class GCDofNumber {
    public static void main(String[] args) {
        // hcf(a,b)*lcm(a,b) = a*b;
        int divisor = 36;
        int dividend = 60;
        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
    }
}
