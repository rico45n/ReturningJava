package Lesson30;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2_0 {
    public static void main(String[] args) {
        List<String> list = List.of("privet" , "Poka" , "Kak dela","Vse norm");
        list.forEach(s -> System.out.println(s));





        //
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(5);
//        arrayList.add(1);
//        arrayList.add(3);
//        arrayList.add(2);
//        arrayList.add(4);
//        arrayList.add(6);
////        arrayList.removeIf(element -> element % 3 == 0);
////        Predicate<Integer> predicate = el -> el % 3==0;
////        arrayList.removeIf(predicate);
//        System.out.println(arrayList);
//        arrayList.sort((x ,y) -> -x.compareTo(y));
//        System.out.println(arrayList);
    }
}
