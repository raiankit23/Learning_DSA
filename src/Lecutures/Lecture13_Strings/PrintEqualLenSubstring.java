package Lecutures.Lecture13_Strings;

public class PrintEqualLenSubstring{
    public static void main(String[] args) {
        String s = "nitin";
        printEqualLenSubs(s);
    }

    private static void printEqualLenSubs(String s){
        for(int len=1;len<s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                System.out.println(s.substring(i, j));
            }
        }
    }
}
