package SelfPractise;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int row = 1;

        while (row<=n){
            //print star
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            //next row ki prep
            row++;
            System.out.println();
        }

    }
}
