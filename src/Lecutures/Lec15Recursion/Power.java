package Lecutures.Lec15Recursion;

public class Power {
    public static void main(String[] args) {
        int a = 3;
        int n = 4;
        System.out.println(pow(a, n));
    }

    private static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int res = pow(a, n - 1);
        return res * a;
    }
}
