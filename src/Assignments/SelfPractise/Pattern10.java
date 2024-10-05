package Assignments.SelfPractise;

public class Pattern10 {
    public static void main(String[] args) {
        int n =5;
        int row = 1;
        int star = 2*n-1;
        int space = 0;
        while (row<=n){
            //space
            int i = 1;
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
            star -= 2;
            space++;
            row++;
            System.out.println();
        }
    }
}
