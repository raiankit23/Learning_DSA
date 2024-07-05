package Lecture2;

public class Pattern4 {
    public static void main(String[] args) {

        // row =1; space = n-1;
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n - 1;

        while (row <= n) {
            //space print
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            //star print
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            // next row ki prep
            row++;
            space--;
            star++;
            System.out.println();

        }
    }
}
