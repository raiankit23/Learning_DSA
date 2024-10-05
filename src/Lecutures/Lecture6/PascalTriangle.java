package Lecutures.Lecture6;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=0;
        int star=1;
        while (row<n){
            int i=0; //
            int val=1;// val = nC0
            while (i<star){
                System.out.print(val+"\t");
                val=((row-i)*val)/(i+1);
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
