package dz26;

public class Animal {
    Animal(){
        System.out.println("A am animal");
    }
    int eyes;

    public void eat(){
        System.out.println("Animal eats");
    }
    public void drink(){
        System.out.println("Animal drink");
    }

}

class Pet extends Animal{
    Pet(){
        this.eyes = 2;
        System.out.println("I am pet");
    }
    String name;
    int tail = 1;
    int paw = 4;
    public void run(){
        System.out.println("Pet run");
    }
    public void jump(){
        System.out.println("Pet jumps");
    }
}
