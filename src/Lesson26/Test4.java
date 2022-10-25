package Lesson26;

public class Test4 {
    static void abc(String s){
        System.out.println("A");
    }
    static void abc(String... s){
        System.out.println("b");
    }
    static void abc(Object s){
        System.out.println("c");
    }
    static void abc(String s1 , String s2){
        System.out.println("d");
    }
    static void def(Long a){
        System.out.println("E");
    }
    static void def(Long... a){
        System.out.println("F");
    }
    static void def(long a){
        System.out.println("g");
    }
    static void def(Object a){
        System.out.println("h");
    }
    static void def(Integer a){
        System.out.println("i");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc("ok");
        t.def(50);
    }
}
