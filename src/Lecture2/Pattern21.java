package Lecture2;

public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = 2 * n - 3;
        int star = 1;
        while (row <= n) {
            //star
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            //space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            // star
            int k = 1;
            if(row == n){
                k++;
            }
            while (k <= star) {
                System.out.print("* ");
                k++;
            }

            row++;
            System.out.println();
            space -= 2;
            star++;
        }
    }
}
