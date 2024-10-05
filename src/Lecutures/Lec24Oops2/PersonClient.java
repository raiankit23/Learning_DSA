package Lecutures.Lec24Oops2;

public class PersonClient {
    public static void main(String[] args)  {
        Person p = new Person("Raj", 21);
        p.setAge(-9);
        System.out.println(p.getAge());
        p.setAge(10);

        System.out.println(p.getAge());
    }



}
