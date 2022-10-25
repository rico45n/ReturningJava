package Lesson23;

public class Test6 {

}

class Animal{
     String showName(){
        return "some Animal";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name of animal " + showName());
    }
}


class Mouse extends Animal{
     @Override
     String showName(){
        return "Jarry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of animal " + showName());
    }

    public static void main(String[] args) {
        Mouse a = new Mouse();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}