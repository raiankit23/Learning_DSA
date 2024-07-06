package SelfPractise;

public class Pattern16 {
    public static void main(String[] args) {
        int n=5;
        int star=n;
        int space=n-1;
        int row=1;
        while (row<=2*n-1){
            //space
            int j=1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }

            //star
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }

            //Mirror
            if(row<n){
                star--;
                space--;
            }
            else {
                star++;
                space++;
            }
            //next row ki prep
            row++;
            System.out.println();
        }
    }
}
