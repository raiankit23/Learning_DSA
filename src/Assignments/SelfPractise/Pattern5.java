package Assignments.SelfPractise;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        int star = n;
        int row =1;

        while (row<=n){
            //space
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
            //next row ki prep
            space++;
            star--;
            row++;
            System.out.println();
        }
    }
}
