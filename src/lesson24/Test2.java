package lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolStoron);
    }
}

abstract class Figura{
    int kolStoron = 0;
   abstract void perimetr();
   abstract void ploshad();
   void showInfo(){}
}

class Kvadrat extends Figura{

    int kolStoron  = 4;
    int storona = 10;
    @Override
    void perimetr() {
        System.out.println("Perimetr" + kolStoron * storona);
    }

    @Override
    void ploshad() {
        System.out.println("Perimetr" + kolStoron * kolStoron);
    }
}
class Prymougolnik extends Figura{
    int kolStoron  = 2;
    int storona = 10;

    @Override
    void perimetr() {
        System.out.println("Perimetr" + kolStoron * kolStoron);
    }

    @Override
    void ploshad() {

    }
}
class Okryjnost extends Figura{

    @Override
    void perimetr() {

    }

    @Override
    void ploshad() {

    }
}

abstract class cHETIREX extends Figura{
    void daf(){}

}