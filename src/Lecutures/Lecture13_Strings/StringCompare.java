package Lecutures.Lecture13_Strings;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "kunal";
        String s2 = "komal";
        //lexographical comparison hota h string me
        System.out.println(s1.compareTo(s2)); // char ke num ka diff
        String s3 = "punam";
        String s4 = "puneet";
        System.out.println(s3.compareTo(s4)); // char ke num ka diff
        String s5 = "ankita";
        String s6 = "ankit";
        System.out.println(s5.compareTo(s6)); // len ke num ka diff
        System.out.println(compareToMethod("Ankit", "Ankita"));
    }
    private static int compareToMethod(String s1, String s2){
        if(s1 == s2){
            return 0;
        }
        int len = Math.min(s1.length(), s2.length());
        for(int i=0;i<len;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i); //+ve s1>s2 || -ve s1<s2
            }
        }
        return s1.length()-s2.length(); // +ve s1>s2 || -ve s1<s2
    }
}
