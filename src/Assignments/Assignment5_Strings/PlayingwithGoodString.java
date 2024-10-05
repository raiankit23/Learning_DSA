package Assignments.Assignment5_Strings;

import java.util.Scanner;

public class PlayingwithGoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countMaxConsecutiveVowel(str));
    }
    private static int countMaxConsecutiveVowel(String str){
        int count=0;
        int ans = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isVowel(ch)){
                count++;
                ans = Math.max(count, ans);
            }
            else{
                count=0;
            }
        }
        return ans;
    }

    private static boolean isVowel(char ch){
        if(ch=='a' || ch =='e' || ch == 'i' || ch == 'o' || ch=='u'){
            return true;
        }
        return false;
    }
}
