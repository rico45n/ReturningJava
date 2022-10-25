package Lessni25;

import java.sql.Driver;

public class Test3 {
    public static void main(String[] args) {
        Employee3 emp1 = new Doctor3();
        Employee3 emp2 = new Teacher3();
        Employee3 emp3 = new Driver3();
        Employee3 emp4 = new Employee3();
        Employee3 [] array = {emp1 ,emp2 , emp3 , emp4};
        for (Employee3 e :array){
            if (e instanceof Driver3){
                System.out.println(((Driver3) e).nazvanieMashini);
                ((Driver3) e).vodit();
            }
        }
    }
}

interface Help_able{
    void help();
}

class  Employee3{
    double salary = 100;
    String name = "Roma";
    int age;
    int experience;
    void eat(){
        System.out.println("Kushat");
    }
    void sleep(){
        System.out.println("Spat");
    }
}

class Doctor3 extends Employee3 implements Help_able{


    public void help(){
        System.out.println("Doctor helping");
    }
    String spechific = "Her";
    void lechit(){
        System.out.println("Lechit");
    }
}

class Teacher3 extends Employee3 {
    int koluchenik;
    void uchit(){
        System.out.println("uchit");
    }
}

class Driver3 extends Employee3 {
    String nazvanieMashini = "lamba";
    void vodit(){
        System.out.println("vodit");
    }
}