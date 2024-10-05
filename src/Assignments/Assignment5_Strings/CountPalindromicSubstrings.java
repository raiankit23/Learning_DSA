package Assignments.Assignment5_Strings;

import java.util.Scanner;

public class CountPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countPalindromicSubStrings(str));
    }
    private static int countPalindromicSubStrings(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String allSubString = str.substring(i, j);
                if(isPalindrome(allSubString)){
                    count++;
                }
            }
        }
        return count;
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
