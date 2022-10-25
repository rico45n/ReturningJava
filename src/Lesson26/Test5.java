package Lesson26;

public class Test5 {
    Test5(){
        System.out.println("Eto konstructor");
    }
    Test5(int a){
        this();
        System.out.println("Eto konstructor2");
    }

    {
        System.out.println("init block");
    }

    static {
        System.out.println("init static block");
    }
    public static void main(String[] args) {
        Test5 test5 = new Test5();
        Test5 test3 = new Test5(3);
    }
}
