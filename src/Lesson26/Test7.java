package Lesson26;

public class Test7 {






static {
   
}
    public static void main(String[] args) {

    }

}

class Animal{
    Animal(){
        System.out.println("Animal");
    }
    static {
        System.out.println("static init animal");
    }
    {
        System.out.println("non-static animal");
    }

}
class Mammal extends Animal{
    Mammal(){
        System.out.println("Mammal");
    }
    static {
        System.out.println("static init Mammal");
    }
    {
        System.out.println("non-static Mammal");
    }
}
class Lion extends Mammal{
    Lion(){
        System.out.println("Lion");
    }
    static {
        System.out.println("static init Lion");
    }
    {
        System.out.println("non-static Lion");
    }
}