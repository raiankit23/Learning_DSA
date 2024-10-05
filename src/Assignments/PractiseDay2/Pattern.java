package Assignments.PractiseDay2;

public class Pattern {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int space=-1;
        int star=n;
        while (row<=2*n-1){
            //star
            int i=1;
            while (i<=star){
                System.out.print("*");
                i++;
            }
            //space
            int j=1;
            while (j<=space){
                System.out.print(" ");
                j++;
            }
            //star
            int k=1;
            if(row==1 || row==2*n-1){
                k=2;
            }
            while (k<=star){
                System.out.print("*");
                k++;
            }
            //Mirror
            if(row<n){
                star--;
                space+=2;
            }
            else {
                star++;
                space-=2;
            }
            //next row ki prep
            row++;
            System.out.println();
        }
    }
}
