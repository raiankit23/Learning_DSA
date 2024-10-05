package Lecutures.Lecture3;
// to be complete later
import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = n;
        int star = 1;
        int space = n/2;

        while (row<=n){
            // space
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            // star
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
            // mirror
            if (row<n/2+1){
                star+=2;
                space--;
            }
            else {
                star-=2;
                space++;
            }
            // next row ki prep
            System.out.println();
            row++;
        }
    }
}
