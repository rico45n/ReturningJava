package Lessni25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        emp1.work();
        emp2.work();
        emp3.work();

        StringBuilder sb = new StringBuilder("t");
        StringBuilder sb1 = new StringBuilder("t");
        System.out.println(sb.equals(sb1));

    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleep");
    }

    abstract void work();
}

class Teacher extends Employee {
    @Override
    void work() {
        System.out.println("Teacher work");
    }
}


class Driver extends Employee {
    @Override
    void work() {
        System.out.println("Driver work");
    }
}

class Doctor extends Employee {
    @Override
    void work() {
        System.out.println("Doctor work");
    }
}