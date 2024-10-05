package Lecutures.Lecture13_Strings;

public class PrintSubstring {
    public static void main(String[] args) {
        String s = "abc";
//        printSubString(s);
        printPalindromicSubstring(s);
//        System.out.println(isPalindrom(s));
    }

    private static void printSubString(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    private static void printPalindromicSubstring(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String allSubstring = s.substring(i, j);
                if(isPalindrom(allSubstring)){
                    System.out.println(s.substring(i, j));
                }
            }
        }
    }


    private static boolean isPalindrom(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
