package Lecutures.Lec24Oops2;

public class Stack {
    private int[] arr;
    private int index = -1;

    public Stack(int n){
        arr = new int[n];
    }
    public Stack(){
        arr = new int[5];
    }
    public boolean isEmpty(){
        return index == -1;
    }
    public boolean isFull(){
        return size() == arr.length;
    }
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Stack full ho gya h");
        }
        index++;
        arr[index] = item;
    }
    public int size(){
        return index+1;
    }
    public int pop(){
        int v = arr[index];
        index--;
        return v;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack Empty Hai");
        }
       return arr[index];
    }
    public void display(){
        for (int i = 0; i <= index ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
