package Lecutures.Lecture13_Strings;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s1==s2); // Address compare
        System.out.println(s1==s3);
        System.out.println(s4==s3);
        System.out.println(s1.equals(s3)); // content compare
    }
    private static boolean stringEquals(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        if(s1 == s2){      // address check
            return true;
        }
        if(s1.length() != s2.length()){  // length check
            return false;
        }
        for(int i=0;i<s1.length();i++){  // checking values character by character
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;

    }
}
