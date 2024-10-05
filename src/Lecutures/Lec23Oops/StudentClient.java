package Lecutures.Lec23Oops;

public class StudentClient {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.selfIntro();
        st1.name = "Kaju";
        st1.age = 21;
        st1.selfIntro();

        st1.sayHi("Raju");

        Student st2 = new Student();
        st2.name = "Raj";
        st2.age = 20;
        st2.selfIntro();

        Student.mentorName();
//        st1.mentorName();
    }

    static {
        System.out.println("Welcome to StudentClient class ");
    }

}
