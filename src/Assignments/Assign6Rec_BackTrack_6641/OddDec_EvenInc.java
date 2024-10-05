package Assignments.Assign6Rec_BackTrack_6641;

public class OddDec_EvenInc {
    public static void main(String[] args) {
        int n = 5;
        printOdd(n);
        printEven(2, n);
    }
    private static void printOdd(int num){

        if(num==1){
            System.out.println(num);
            return;
        }

        System.out.println(num);
        printOdd(num-2);
    }

    private static void printEven(int num, int limit){

        if(num>limit){
            return;
        }

        System.out.println(num);
        printEven(num+2, limit);

    }

}
