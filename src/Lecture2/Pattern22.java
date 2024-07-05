package Lecture2;

public class Pattern22 {
    public static void main(String[] args) {

        // row =1, star = 2n-1, space = 0

        int n = 5;
        int row = 1;
        int space = -1;
        int star = n;
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
            if(k==n){

            }
            while (k <= star) {
                System.out.print("* ");
                k++;
            }

            row++;
            System.out.println();
            space++;
            star-=2;
        }
    }
}
