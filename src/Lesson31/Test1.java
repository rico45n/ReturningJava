package Lesson31;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);


        Info<Integer> info2 = new Info<>(500);
        System.out.println(info2);
        Integer i = info2.getValue();
        System.out.println(i);
    }

//    public void abc(Info<String> info){
//         String  s = info.getValue();
//    }
//    public void abc(Info<Integer> info){
//        Integer  s = info.getValue();
//    }
}





class Info<T>{

    public Info(T value){
        this.value = value;
    }
    private T value;
    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue(){
        return value;
    }
}


class Parent{
    public void abc(Info<String> info){
        String  s = info.getValue();
    }
}



interface Animal{
    void sleep();
    void plus1(int a , int b);
}