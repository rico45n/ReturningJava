package dz_24;

public class DZ24 {
    public static void main(String[] args) {











        //Mechenosec

        Mechenosec mechenosec = new Mechenosec("Меченосец");
        Animal m2 = new Mechenosec("rf");


        //Pingvin
        Speakable pingvin = new Pingvin("Pingvin");
        Animal pg1 = new Pingvin("f");
        Pingvin pg2 = new Pingvin("ERG");
        Bird pg3 = new Pingvin("rtg");

        //lev
        Animal lev = new Lev("Leva");
        Speakable lev2 =  new Lev("Lebv2");
        Lev l2 = new Lev("RTTR");
        Mammal m23 = new Lev("43");


        Speakable[] arraySpikable = {pingvin, pg2 , lev2, pg3, m23 ,l2};


        for (Speakable speakable:arraySpikable){
            if (speakable instanceof Pingvin){
                Pingvin gp = (Pingvin)speakable;
                gp.eat();
                gp.sleep();
                gp.speak();
                gp.fly();
            }
            if (speakable instanceof Lev){
                lev.eat();
                lev.sleep();
                ((Speakable) lev).speak();
            }

        }

        Animal[] arrayAnimal =  {mechenosec, (Animal) pingvin,lev};
        for (Animal animal : arrayAnimal){
            if (animal instanceof Mechenosec){
                mechenosec.sleep();
                mechenosec.swim();
                mechenosec.eat();
            }
            if (animal instanceof Pingvin){
                pingvin.speak();
                ((Animal) pingvin).eat();
                ((Animal) pingvin).sleep();
            }
            if (animal instanceof Lev){
                lev.eat();
                lev.sleep();
                ((Speakable) lev).speak();
            }
        }


    }
}

class Animal{
    public  void eat(){}
    public void sleep(){}
    Animal(String name){
        System.out.println("Animal name : " + name);
    }
}


abstract class Fish extends Animal{
    Fish(String name) {
        super(name);
    }

    @Override
    public void sleep(){
        System.out.println("Vsegda interesno nablydat kak spat ribi");
    }

    public void swim(){}

}

abstract class Bird extends Animal implements Speakable{

    Bird(String name) {
        super(name);
    }
    @Override
    public void speak(){
        System.out.println("Pupa" + " sings");
    }

    public void fly(){}
}

abstract class Mammal extends Animal implements Speakable{

    Mammal(String name) {
        super(name);
    }

    public void run(){}
}

interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish{

    Mechenosec(String name) {
        super(name);
    }
    @Override
    public void swim(){
        System.out.println("Mechenosec krasivai riba kotorya bistro plavaet!");
    }

    @Override
    public void eat(){
        System.out.println("Mechenosec ne xishnai riba i ona est obichniy ribiy korm");
    }

}
class Pingvin extends Bird{

    Pingvin(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("Pingvin lubit eat ribu");
    }
    @Override
    public void sleep(){
        System.out.println("Pingvini spat prijavshis dryg k drygy");
    }
    @Override
    public void fly(){
        System.out.println("Pingvin ne ymeet litat");
    }
    @Override
    public void speak(){
        System.out.println("Pingvin ne umeet pet kak solovei");
    }
}
class Lev extends Mammal{

    Lev(String name) {
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("Lev est maso");
    }
    @Override
    public void sleep(){
        System.out.println("Lev mnogo spit");
    }
    @Override
    public void run(){
        System.out.println("Lev ne samoe bistroe jivotnoe");
    }
}