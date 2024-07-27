package SelfPractise;

public class Pattern30 {
    public static void main(String[] args) {
        int row = 1;
        int n = 5;


        while (row <= n) {
            int i = 1;
            int star = n;
            while (i <= star) {
                System.out.print(star + " ");
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
