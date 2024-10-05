package Lecutures.Lecture2;

public class Pattern30 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int num = 5;

        while (row <= n){
            int i=1;
            while (i<=num){
                System.out.print(num+" ");
                num--;
                i++;
            }
            //next row ki prep
            row++;
            System.out.println();

        }
    }

}
