package Lesson23;

public class Test7 {
    public static void main(String[] args) {
        A c1 = new C();
        c1.abc(new B());
    }

}
class A{
    void abc(A a){
        System.out.println("A");
    }
}
class B extends A{

    void abc(B b1){
        System.out.println("B");
    }
}
class C extends B{

    @Override
    void abc(B c2){
        System.out.println("C");
    }
}