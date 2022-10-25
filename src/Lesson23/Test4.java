package Lesson23;

public class Test4 {

    void abc(Animal1 a){
        System.out.println("A");
    }

    void abc(Mouse1 m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        Animal1 animal = new Mouse1();
        test4.abc(animal);
    }









//    void abc(Animal a){
//        System.out.println("A");
//    }
//
//
//    void abc(Mouse m){
//        System.out.println("M");
//    }
//
//    public static void main(String[] args) {
//        Test4 t = new Test4();
//        Animal an = new Mouse();
//        t.abc(an);
//        an.getName();
//    }
//}
//
//class Animal{
//    void getName(){
//        System.out.println("Animal");
//    }
//}
//
//class Mouse extends Animal{
//    @Override
//    void getName(){
//        System.out.println("Mouse");
//    }
}

class Animal1{
    {
        System.out.println("Animal");
    }
}
class Mouse1 extends Animal1{
    void getName(){
        System.out.println("Mouse");
    }
}