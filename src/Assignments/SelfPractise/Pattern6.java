package Assignments.SelfPractise;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = n;
        int space = 0;

        while (row<=n){

            // space
            int j=1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }

            //star
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }

            // next row ki prep
            space +=2;
            star -=1;
            row++;
            System.out.println();
        }
    }
}
