package dz26;

public class X {

}
class Y extends  X{

}
class Test42{
    public static void abc(X x, Y y){
        System.out.println("hi");
    }
    public static void abc(Y y, X x){
        System.out.println("by");
    }
    public static void main(String[] args) {
        Y a = new Y();
        X x = new X();
        abc(a,x);
    }
}
//1 задание (Y)
//2 задание (Y Y Y)
//3 задание (X + 18 FALSE)
//4 задание (error)
//5 задание (Y)