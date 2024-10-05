package Lecutures.Lecture4;

public class SumOfDigit {
    public static void main(String[] args) {
        int digit = 1287;
        int sum = 0;

        while (digit > 0){
            int rem = digit%10;
            sum += rem;
            digit = digit/10;
        }
        System.out.println(sum);

    }
}
