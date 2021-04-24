package algos;

import java.util.HashMap;
import java.util.Map;

public class TestMap {


    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("one" , 1);
        map.put("two" , 2);
        map.put("three" , 3);
        map.putIfAbsent("three" , 6);

        System.out.println(map.getOrDefault("eight",0));


        System.out.println(map.get("three"));
        System.out.println(map.get("five"));
        System.out.println(map.containsKey("five"));
        System.out.println(map.containsKey("three"));
        System.out.println(map.containsValue(3));
        System.out.println(map.containsValue(6));

        map.replace("three" , 7);

        map.replace("three" , 0,9);

        System.out.println(map.containsValue(9));
    }


}
