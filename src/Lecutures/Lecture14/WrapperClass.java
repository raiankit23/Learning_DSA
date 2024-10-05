package Lecutures.Lecture14;

public class WrapperClass {
    public static void main(String[] args) {
        int x=9;
        Integer x1 = 9;
        x1 = x; //auto-boxing;
        int a = 89;
        Integer a1 = 7869;
        a = a1; //Unboxing;

        Integer p1 = 78;
        Integer p2 = 78;
        Integer p3 = 178;
        Integer p4 = 178;
        System.out.println(p1 == p2);
        System.out.println(p3 == p4);

        int s1 = 78;
        int s2 = 78;
        int s3 = 178;
        int s4 = 178;
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

    }

}
