package lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swin_able s = new Driver();
        Employee e = new Driver();
        h.tushitPojar("rg");
        h.pomosh();
        s.swim();

    }
}
class  Employee{
    double salary = 100;
    String name = "Roma";
    int age;
    int experience;
    void eat(){
        System.out.println("Kushat");
    }
    void sleep(){
        System.out.println("Spat");
    }
}


 class Teacher extends Employee implements Help_able {

    int koluchenik;
    void uchit(){
        System.out.println("uchit");
    }


     @Override
     public void pomosh() {
         System.out.println("Pomosh");
     }

     @Override
     public void tushitPojar(String s) {
         System.out.println("Toshit :" + s);
     }
 }

class Driver extends Employee implements Help_able ,Swin_able{
    String nazvanieMashini;
    void vodit(){
        System.out.println("vodit");
    }

    @Override
    public void pomosh() {
        System.out.println("Pomosh");
    }

    @Override
    public void tushitPojar(String s) {
        System.out.println("Toshit :" + s);
    }

    @Override
    public void swim() {
        System.out.println("Plawaet");
    }
}
interface Help_able{
    void pomosh();
    void tushitPojar(String s);
}

interface Swin_able{
    void swim();
}