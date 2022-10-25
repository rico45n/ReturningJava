package lesson24;

import Lesson23.A10;

public class Test4 {
    public static void main(String[] args) {
        Jamper j1 = new Human();
        Jamper j2 = new Animal();
        j2.jamp();
    }

}
class Human implements Jamper{
    @Override
    public void jamp() {
        System.out.println("Human jamp");
    }
}
class Animal implements Jamper{
    @Override
    public void jamp() {
        System.out.println("Animal jamp");
    }
}
interface Jamper{
    void jamp();
}


interface A2{
    void abc();
}
interface B2 extends A2,Jamper{void def();}
 abstract class D implements A2,B2{

}