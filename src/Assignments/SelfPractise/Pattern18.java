package Assignments.SelfPractise;

public class Pattern18 {
    public static void main(String[] args) {
        int n=7;
        int star=1;
        int space=n/2;
        int row=1;
        while (row<=n){
            //space
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
            //mirror
            if(row<=n/2){
                star+=2;
                space--;
            }else {
                star-=2;
                space++;
            }
            //next row ki prep
            row++;
            System.out.println();
        }
    }
}
