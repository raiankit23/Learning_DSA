package Assignments.Assignment5_Strings;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    private static boolean isPalindrome(String str){
        int start = 0;
        int last = str.length()-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(start) != str.charAt(last)){
                return false;
            }else {
                start++;
                last--;
            }
        }
        return true;
    }
}
