package Lecture2;

public class Pattern1 {

    public static void main(String[] args) {
        int n = 5;  //user input kis n ke liye kaam krna h
        int row = 1;
        int star = n;
        while (row <= n) {
            //star print
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            //next row ki preparation
            row++;
            System.out.println();
        }
    }
}
