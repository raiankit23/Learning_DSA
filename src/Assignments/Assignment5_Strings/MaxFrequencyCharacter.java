package Assignments.Assignment5_Strings;

import java.util.Scanner;

public class MaxFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "aaabacb";
        System.out.println(getMaxChar(str));
    }
    private static char getMaxChar(String str){
        int[] frequency = new int[256];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            frequency[ch]++;
        }
        int maxCount=0;
        char maxChar='\u0000';
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(frequency[ch]>maxCount){
                maxCount = frequency[ch];
                maxChar = ch;
            }
        }
        return maxChar;
    }
}
