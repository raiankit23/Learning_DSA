package SelfPractise;

public class Pattern21 {
    public static void main(String[] args) {
        int row=1;
        int n=5;
        int star=1;
        int space=2*n-3;
        while (row<=n){
            //star
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            int j=1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }
            //star
            int k=1;
            if(row==n){
                k=2;
            }
            while (k<=star){
                System.out.print("* ");
                k++;
            }
            //next row ki prep
            star++;
            space-=2;
            row++;
            System.out.println();
        }
    }
}
