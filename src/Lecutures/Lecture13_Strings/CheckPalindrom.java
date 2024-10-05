package Lecutures.Lecture13_Strings;

public class CheckPalindrom {
    public static void main(String[] args) {
        String s = "nitin";
        System.out.println(isPalindrom(s));
    }
    private static boolean isPalindrom(String s){
        int i=0;
        int j=s.length();
        while (i<i){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
