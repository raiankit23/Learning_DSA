package Assignments.RecPractise1;

public class CountSubstringUsingRecusion {
    public static void main(String[] args) {
        String ques = "abc";
        System.out.println(countSubString(ques, ""));
//        countSubString(ques, "");
    }
    private static int countSubString(String ques, String ans){

        if(ques.length()==0){
//            System.out.println(ans);
            return 1;
        }

        char ch = ques.charAt(0);
        int a = countSubString(ques.substring(1), ans);
        int b = countSubString(ques.substring(1), ans+ch);

        return a+b;
    }
}
