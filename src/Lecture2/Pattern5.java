package Lecture2;

public class Pattern5 {
    public static void main(String[] args) {

        int n=5;
        int row = 1;
        int space = 0;
        int star = 5;

        while (row<=n){

            // print space
            int j=1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }
            // print star
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }

            row++;
            space++;
            star--;
            System.out.println();
        }

    }
}
