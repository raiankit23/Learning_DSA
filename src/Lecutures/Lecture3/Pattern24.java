package Lecutures.Lecture3;

public class Pattern24 {
    public static void main(String[] args) {
        // at row =1; star = 1; space = n-1
        int n = 5;
        int row = 1;
        int star = 1;
        int space = n-1;

        while (row <= n) {
            //space print
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            //star print
            int j = 1;
            int val=row;
            while (j <= star) {
                System.out.print(val + " ");
                j++;
            }
            // next row ki prep
            row++;
            space--;
            star+=2;
            System.out.println();

        }
    }
}
