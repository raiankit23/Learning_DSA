package Lecutures.Lec19Recursion4;

public class KeyPad {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String ques = "23";
        printing(ques, "");
    }

    private static void printing(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String press = key[ch - '0']; // key[ch-48]; '0' = 48 it is char to int conversion as '0' ascii = 48.

        for (int i = 0; i < press.length(); i++) {
            printing(ques.substring(1), ans + press.charAt(i));
        }

    }
}
