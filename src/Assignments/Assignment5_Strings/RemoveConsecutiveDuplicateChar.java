package Assignments.Assignment5_Strings;
import java.util.*;
public class RemoveConsecutiveDuplicateChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removeConsecutiveDuplicates(str);
    }
    private static void removeConsecutiveDuplicates(String str){
        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));

        for(int i=1;i<str.length();i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);
            if(ch1 != ch2){
                sb.append(ch1);
            }
        }

        System.out.println(sb.toString());
    }
}
