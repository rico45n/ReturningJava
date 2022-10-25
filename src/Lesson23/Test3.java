package Lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee2 t = new Teacher2();
        t.eat1();
    }
}

class Eda{

}
class Fructs extends Eda{

}

//class  Employee2{
//    double salary = 100;
//    String name;
//    int age;
//    int experience;
//
//    Eda eat1(){
//        System.out.println("Kushat");
//        Eda e = new Eda();
//        return e;
//    }
//
//    void sleep(){
//        System.out.println("Spat");
//    }
//
//}
//
//class Teacher2 extends Employee2 {
//
//    Eda eat1(){
//        System.out.println("Kushat rabotnik");
//        Eda e = new Eda();
//        return e;
//    }
//
//    int kolichestvoUchenik;
//    void uchit(){
//        System.out.println("uchit");
//    }
//}
//
//
//
//
//class A {
//    Employee2 objectCreation(){
//        return new Employee2();
//    }
//}
//class B extends A {
//    Teacher2 objectCreation(){
//        System.out.println("Ok");
//        return new Teacher2();
//    }
//}