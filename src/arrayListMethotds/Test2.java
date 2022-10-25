package arrayListMethotds;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("two");
        list.add("thee");
        list.add("four");
        list.add("five");
        for (Object s : list){
            System.out.println("Namber = " + s);
        }
    }
}
