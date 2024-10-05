package Lecutures.Lec17Recursion3;

public class Lexicographical {
    public static void main(String[] args) {
        int curr=0;
        int n=1000;
        lexicogrphical_counting(n, 0);
    }
    private static void lexicogrphical_counting(int n, int curr){
        System.out.println(curr);
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
        lexicogrphical_counting(n, curr*10+i);
        }
    }
}
