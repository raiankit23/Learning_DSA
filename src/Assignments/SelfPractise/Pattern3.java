package Assignments.SelfPractise;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int star = n;
        int row = 1;

        while (row<=n){
            // print star
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            //next row ki prep
            star--;
            row++;
            System.out.println();
        }
    }
}
