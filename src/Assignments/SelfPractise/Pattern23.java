package Assignments.SelfPractise;

public class Pattern23 {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        int star = 1;
        int value = 1;
        int space = n-1;
        while (row<=n){
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print(value+" ");
                j++;
            }
            //next row ki prep
            star+=2;
            space-=1;
            row++;
            System.out.println();
        }
    }
}
