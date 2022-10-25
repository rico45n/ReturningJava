package Lesson23;

public class A10 {
    String s1 = "hi";
    int i = 010;
    static double aDouble = 3.14;
    int summa(int... i){
        int rez = 0;
        for (int a : i){
            rez+=a;
        }
        return rez;
    }
    static void abc(){
        System.out.println("stst method");
    }
}

class B10 extends A10{
//    String s2 = super.s1 + "Drug";


int summa(int... i){
    int rez = 0;
    for (int a : i){
        rez+=a;
    }
    System.out.println("summa" + rez);
    return rez;
}

    public static void main(String[] args) {

    }
}