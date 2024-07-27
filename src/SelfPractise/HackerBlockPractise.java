package SelfPractise;
import java.util.*;
public class HackerBlockPractise {
    public static void main(String args[]) {
        int n=5;
        int row=1;
        int space=0;
        int star=2*n+1;
        int val=n;
        while(row<=2*n+1){
            //space
            int i=1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            //star
            int j=1;
            while(j<=star){
                System.out.print(val+"\t");
                if(j<n+1){
                    val--;
                }else {
                    val++;
                }
                j++;
            }
            //mirror
            if(row<n+1){
                space++;
                star-=2;
                
            }else {
                space--;
                star+=2;

            }
            //next row ki prep
            row++;

            System.out.println();
        }

    }
}