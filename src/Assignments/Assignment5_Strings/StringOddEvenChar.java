package Assignments.Assignment5_Strings;

import java.util.Scanner;

public class StringOddEvenChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = replaceOddEven(str);
        System.out.println(result);
    }

    private static String replaceOddEven(String str) {

        StringBuilder modifiedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                modifiedStr.append((char) (ch+1));
            } else {
                modifiedStr.append((char) (ch-1));
            }

        }
        return modifiedStr.toString();
    }
}
