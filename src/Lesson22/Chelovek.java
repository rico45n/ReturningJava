package Lesson22;

public class Chelovek {

    String name = "roma";
    public static double salary = 150;
    void work(){
        System.out.println("Rabota");
    }
    public static void rest(){
        System.out.println("Otdix");
    }
}

class Student extends Chelovek{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.salary);
        s.work();
        s.rest();
    }
}