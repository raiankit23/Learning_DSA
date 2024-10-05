package Lecutures.Lec17Recursion3;

public class CharSearch {
    public static void main(String[] args) {
        String s= "abcbvabavacf";
        System.out.println(isPresent(s, 'c', 3));
    }
    private static boolean isPresent(String str, char ch, int i){
        for(;i<str.length();i++){
            if(str.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}
