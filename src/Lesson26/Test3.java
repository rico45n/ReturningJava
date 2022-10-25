package Lesson26;

public class Test3 {
    void abc(int i){
        System.out.println(i);
    }
    void abc(byte i){
        System.out.println(i);
    }
    void abc(long i){
        System.out.println(i);
    }
    void def(Object o){
        System.out.println(o);
    }
    void def(String o){
        System.out.println(o);
    }

    void ghi(int i , int b){
        System.out.println("hi 1");
    }
    void ghi(long i , long b){
        System.out.println("hi 2");
    }
    void ghi(Integer i , Integer b){
        System.out.println("hi 3");
    }
    void ghi(int... i){
        System.out.println("hi 4");
    }
    public static void main(String[] args) {
        Test3 t = new Test3();

        t.ghi(1 , 2);
    }
}
