package Lecutures.Lecture13_Strings;

public class StringDemo3 {
    public static void main(String[] args) {
        System.out.println("Hello"+10+20+"Bye");
        System.out.println("Hello"+(10+20)+"Bye");
        System.out.println(10+20+"Hello"+"Bye");
        System.out.println(10+20+"Hello"+"Bye"+30+50);
        String s = "codingblocks";
        System.out.println(s.substring(2, 6)); // 2 to 5th index tak ka char milega
        System.out.println(s.substring(3)); // 3 index se pura String dega

    }
}
