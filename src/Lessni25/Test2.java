package Lessni25;

public class Test2 {
    public static void main(String[] args) {
        Jumpble j = new Human();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof Jumpble){
            System.out.println("j - Jampbl");
        }
        if (m instanceof Human){
            System.out.println("m - human");
        }
    }
}

interface Jumpble{}
class Human implements Jumpble{}
class Man extends Human{

}
class Student{

}