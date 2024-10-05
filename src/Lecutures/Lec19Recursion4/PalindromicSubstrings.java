package Lecutures.Lec19Recursion4;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String str = "naan";
        System.out.println(countPalindrome(str));

    }
    private static int countPalindrome(String str){
        int odd=0;
        // odd length ke total Palindromic subString count kr rhe h
        for(int axis=0; axis<str.length();axis++){
            for(int orbit=0;axis-orbit>=0 && axis+orbit<str.length();orbit++){
                if(str.charAt(axis-orbit) != str.charAt(axis+orbit)){
                    break;
                }
                odd++;
            }
        }
        //even length ke total palindromic substring count kr rhe h
        int even=0;
        for(double axis=0; axis<str.length();axis++){
            for(double orbit=0;axis-orbit>=0 && axis+orbit<str.length();orbit++){
                if(str.charAt((int)(axis-orbit)) != str.charAt((int)(axis+orbit))){
                    break;
                }
                even++;
            }
        }
        return odd+even;
    }
}
