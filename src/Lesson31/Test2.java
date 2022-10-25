package Lesson31;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("by");
        System.out.println(GenMethod.getSecondElement(arrayList));

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(5);
        System.out.println(GenMethod.getSecondElement(arrayList2));

    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}