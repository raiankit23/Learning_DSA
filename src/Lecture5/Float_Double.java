package Lecture5;

import java.util.Scanner;

public class Float_Double {
    public static void main(String[] args) {
        float f=6.7f;
        double d=19.56;
        Scanner sc = new Scanner(System.in);
        f=sc.nextFloat();
        d=sc.nextDouble();
        boolean f1=true;
        boolean f2=false;
        f1=sc.nextBoolean();
        System.out.println(f1);
        System.out.println(d);
        System.out.println(f);
    }
}
