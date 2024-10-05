package Assignments.SelfPractise;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int row = 1;

        while (row<=n){
            // star print
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            //next row ki prep
            star++;
            row++;
            System.out.println();
        }
    }
}
