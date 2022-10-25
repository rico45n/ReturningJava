package Lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red" , "v4");
        Car c2 = new Car("red" , "v4");
        Car c3 = new Car("black" , "v8");
        ArrayList <Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4 = new Car("black" , "v8");
        System.out.println(list.toString());
    }
}

class Car{
    String color;
    String eng;
    Car(String color , String eng){
        this.color = color;
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", eng='" + eng + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car){
            Car c2 = (Car)obj;
            return (color.equals(c2.color) && eng.equals(c2.eng));
        }else {
            return false;
        }
    }
}