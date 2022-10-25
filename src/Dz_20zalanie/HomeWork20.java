package Dz_20zalanie;


import java.util.ArrayList;
import java.util.Collections;

public class HomeWork20 {
    public static void main(String[] args) {
        PupiCheck.abc("c" , "b" , "a" , "a");
    }

}
class PupiCheck{
    static ArrayList<String> abc(String... st1){
        ArrayList<String> list = new ArrayList<>();
        for (String st : st1){
            if (!list.contains(st)){
                list.add(st);
            }

        }
        Collections.sort(list);
        System.out.println(list.toString());

        return list;
    }
}