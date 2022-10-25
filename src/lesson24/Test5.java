package lesson24;

public class Test5 {

}
interface  I1{

    default void abc(){System.out.println("eto metod abc");}
    static void def(){
        System.out.println("static method");
    }

}

interface I2 {
    static void def(){
        System.out.println("static method 2" );
    }
}
abstract class Dex{

}
interface Dex2{

}

class Tew extends Dex{}
class R{
   
    public static void main(String[] args) {

    }
}

//class Z implements I1{
//
//    @Override
//    public void adc() {
//        System.out.println("eto metod abc");
//    }
//
//    public static void main(String[] args) {
//        Z z = new Z();
//        z.adc();
//        z.def();
//        z.ghi();
//    }
//}