package Lecutures.Lec22Divide_Conquer;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int low=10;
        int high=100;
        Random randomNum = new Random();
        for (int i = 0; i < 10; i++) {
            int v = randomNum.nextInt(high-low)+low;
            System.out.println(v);
        }
    }
}
