package Assignments.Assignment5_Strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(toggleCase(str));
    }
    private static String toggleCase(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
        }
        return sb.toString();
    }
}
