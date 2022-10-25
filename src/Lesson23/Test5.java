package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee2 employee2 = new Employee2();
        Teacher2 t = new Teacher2();
        t.sleep();
        Employee2 emp = new Teacher2();
        employee2.sleep();

    }
}
class  Employee2{
    double salary = 100;
    String name;
    int age;

    public Eda eat1(){
        System.out.println("Kushat");
        Eda e = new Eda();
        return e;
    }

     void sleep(){
        System.out.println("Spat rab");
    }

}

class Teacher2 extends Employee2 {

    public Eda eat1(){
        System.out.println("Kushat rabotnik");
        Eda e = new Eda();
        return e;
    }

    int kolichestvoUchenik;

    void uchit(){
        System.out.println("uchit");
    }
    @Override
    void sleep(){
        System.out.println("Spat uchel");
    }

}

final class T{}


