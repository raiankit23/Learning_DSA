package Lecutures.Lecture2;

public class Pattern6 {

    public static void main(String[] args) {

        // at row =1; star = n; space = 0
        int n = 5;
        int row = 1;
        int star = n;
        int space = 0;

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
            space+=2;
            star--;
            System.out.println();

        }
    }

}
