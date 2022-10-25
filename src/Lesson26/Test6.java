package Lesson26;

public class Test6 {
    int a = 3;
    Test6(){
        a = 4 ;
    }
    {
        a = 5 ;
    }

//    public static void main(String[] args) {
//        Test6 t = new Test6();
//        System.out.println(t.a);
//    }
}

class A{
    static final int b ;
    static {
        b = 10 ;
    }
}

class B{
    static int e;
    static final int d;
    static final int e2 = 1;
    static final int f;
    static {
//        e = 5;
        d = 3;
//        e2 = 2;
        f = 0;
    }
}

class C {
    String s = "Ok";
    {
        System.out.println(s);
    }
    static int i = 0;

    static {
        System.out.println(i);
    }
    {
        i = i +1;
        System.out.println(i);
    }
    C(){
        System.out.println("Konstructor");
    }

    public static void main(String[] args) {
        System.out.println("Hi vsem");
        C c = new C();
    }
}

class D{
    static {abc(2);} //1
    static void abc(int a){
        System.out.println(a + " ");
    }
    D(){abc(5);}
    static {abc(4);}//2
    {abc(6);}//4
    static {new D();}//3

    public static void main(String[] args) {

    }
}