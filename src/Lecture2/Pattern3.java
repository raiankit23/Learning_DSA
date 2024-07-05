package Lecture2;

public class Pattern3 {
    public static void main(String[] args) {

        int n = 5;
        int row = n;
        int star = 5;

        while(row<=n){
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            //next row ki prep
            row++;
            star--;
            System.out.println();
        }

    }
}
