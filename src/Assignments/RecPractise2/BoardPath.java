package Assignments.RecPractise2;

public class BoardPath {
    public static void main(String[] args) {
        int target = 3;
        printAns(target, 0, "");
    }

    private static void printAns(int target, int current, String ans) {

        if (current == target) {
            System.out.println(ans);
            return;
        }
        if (current > target) {
            return;
        }

        for (int dice = 1; dice <= 3; dice++) {
            printAns(target, current + dice, ans + dice);
        }

        /*printAns(target, current+1, ans+1);
        printAns(target, current+2, ans+2);
        printAns(target, current+3, ans+3);*/
    }
}
