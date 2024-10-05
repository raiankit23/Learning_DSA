package Lecutures.Lec24Oops2;

public class Person {
    private String name = "Kaju";
    private int age = 20;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {   // throws is function defination and throw inside method to throw out of defination
        try {
            if (age < 0) {
                throw new Exception("Age -ve nhi hoga");
            }
            this.age = age;
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        finally {
            System.out.println("I am finally block");
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
