package Lecutures.Lec15Recursion;

public class Print_Dec {
    public static void main(String[] args) {
        int n = 5;
        PD(n);
    }

    private static void PD(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PD(n - 1);

    }
}
