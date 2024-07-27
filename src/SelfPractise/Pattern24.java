package SelfPractise;

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int value=1;
        int space=n-1;
        int star=1;

        while (row<=n){
            //space
            int i=1;
            while (i<=space){
                System.out.print("\t");
                i++;
            }
            //star
            int j=1;
            while (j<=star){
                System.out.print(value+ "\t");
                j++;
            }
            //next row ki prep
            value++;
            star+=2;
            space--;
            row++;
            System.out.println();
        }
    }
}
