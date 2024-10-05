package Assignments.Assignment5_Strings;

import java.util.Scanner;

public class DiffInAsciiCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = diffInAsciiCode(str);
        System.out.print(result);
    }
    private static String diffInAsciiCode(String str){
        StringBuilder str1 = new StringBuilder();
        for(int i=0;i<str.length()-1;i++){
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i+1);
            int n = nextChar - currentChar;
            str1.append(currentChar);
            str1.append(n);
        }
        str1.append(str.charAt(str.length()-1));
        return str1.toString();
    }
}
