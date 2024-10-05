package Assignments.Assignment5_Strings;

import java.util.Scanner;

public class CanYouReadThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        String str = "IAmACompetitiveProgrammer";
        canYouReadThis(str);
    }
    private static void canYouReadThis(String str){
        StringBuilder word = new StringBuilder();
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(Character.isUpperCase(ch)){
               if(word.length()>0){
                   System.out.println(word);
               }
               word = new StringBuilder();
           }
           word.append(ch);
        }
        System.out.println(word);
    }
}
