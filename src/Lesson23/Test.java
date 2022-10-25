package Lesson23;

public class Test {
    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee em = new Employee();
//        Xirurg x = new Xirurg();


        Employee em1 = new Doctor();
        System.out.println(em1.salary);
        System.out.println(em1.name);
        System.out.println(em1.age);
        System.out.println(em1.experience);
        em1.eat();
        em1.sleep();

        Employee em2 = new Teacher();




        Employee em3 = new Driver();
        Xirurg x = new Xirurg();
        Doctor d2 = new Xirurg();
        Employee em4 = new Xirurg();

    }
}

class  Employee{
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("Kushat");
    }
    void sleep(){
        System.out.println("Spat");
    }
}

class Doctor extends Employee {

    void lechit(){
        System.out.println("Lechit");
    }
}

class Xirurg extends Doctor {
    String skalpel;
    void operaciya(){}
}

class Teacher extends Employee {
    int koluchenik;
    void uchit(){
        System.out.println("uchit");
    }
}

class Driver extends Employee {
    String nazvanieMashini;
    void vodit(){
        System.out.println("vodit");
    }
}