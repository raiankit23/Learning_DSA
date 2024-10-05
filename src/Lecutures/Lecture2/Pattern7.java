package Lecutures.Lecture2;

public class Pattern7 {
    public static void main(String[] args) {
        int n=5;  // user input
        int row = 1;
        int star = n;
        int space = 0;

        while (row<=n){

            // star print in first and last row
            int i=1;
            while (i<=star){
                if(row==1 || row == n){
                    System.out.print("* ");
                } else {
                    System.out.print("*      *");
                }
                i++;
            }

            row++;
            System.out.println();
        }
    }
}
