package Lecutures.Lecture13_Strings;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "Hello";// StringPool
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        s1 = s1 + "Bye";
        s1 = s1 + s3;
        s1 = s1.concat(s3);
        String s5 = "Hey"+"Bye"; // StringPool
        System.out.println(s1.length());
        System.out.println(s5);
        System.out.println(s5.charAt(2));
    }
}
