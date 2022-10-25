package arrayListMethotds;

import java.util.ArrayList;
import java.util.List;

public class Tes1 {
    public static void main(String[] args) {
        ArrayList <String > list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("thee");
        list.add("four");
        list.add("five");
        System.out.println("All = " + list);

        List <String> list1 = List.of("1" , "2" , "3" , "4");
        System.out.println(list1);
        List <String> list2 = List.copyOf(list1);
        System.out.println(list2);
    }
}
