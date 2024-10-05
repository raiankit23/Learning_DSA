package Lecutures.Lec23Oops;

public class Student {
    String name;
    int age;

    // always access class data member with this keyword, its best practise

    /*
    * static is dependent on class it's behaviour will be same for all objects.
    * */
    public void selfIntro(){
        System.out.println("My name is "+ this.name+ " and age is "+ this.age);
    }

    public void sayHi(String name) {
        System.out.println(this.name + "Say Hi "+ name);
    }

    public static void mentorName(){
        System.out.println("Monu Bhaiya");
    }
    // static block
    static {
        System.out.println("Welcome to Student Class");
    }
    static {
        System.out.println("lol to student class");
    }
}
