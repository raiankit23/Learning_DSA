package Lecutures.Lec24Oops2;

public class Queue {
    private int[] arr;
    private int front = 0;
    private int size = 0;

    public Queue(){
        arr = new int[5];
    }
    public Queue(int n){
        arr = new int[n];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size == arr.length;
    }
    public void enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue full ho gya hai");
        }
        int index = (front+size)%arr.length;
        arr[index] = item;
        size++;
    }
    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Empty hai");
        }
        int v = arr[front];
        front = (front+1)% arr.length;
        size--;
        return v;
    }
    public int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue Empty hai");
        }
        int v = arr[front];
        return v;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            int idx = (front+i)% arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
