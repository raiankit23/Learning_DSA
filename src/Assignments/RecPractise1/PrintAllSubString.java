package Assignments.RecPractise1;

public class PrintAllSubString {
    public static void main(String[] args) {
        String ques = "abc";
        printAllSubString(ques, "");
    }

    private static void printAllSubString(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        printAllSubString(ques.substring(1), ans);
        printAllSubString(ques.substring(1), ans + ch);
    }
}
