package arrayListMethotds;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        map.put(3 , "Roma");
        map.put(2 , "Rita");
        map.put(5 , "Rima");
        map.put(54 , "reterta");
        map.remove(3);
        System.out.println(map);
    }
}
