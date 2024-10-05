package Lecutures.Lec17Recursion3;

public class PermutationWithNoRepeat {
    public static void main(String[] args) {
        String ques = "abc";
        String ans = "";
        printPermutationString(ques, ans);
    }
    private static void printPermutationString(String ques, String ans){

        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<ques.length();i++) {
            char ch = ques.charAt(i);
            if (!isPresent(ques, ch, i + 1)) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);
                printPermutationString(s1 + s2, ans + ch);
            }
        }
    }

    private static boolean isPresent(String str, char ch, int i){
        for(;i<str.length();i++){
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}
