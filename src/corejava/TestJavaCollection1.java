package corejava;

import java.util.*;

import java.util.*;
import java.util.stream.Collectors;

class TestJavaCollection1 {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "TestJavaCollection1{}";
    }

    public void test() {

    }
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
//Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        HashMap<String,String> hashmap =  new HashMap<>();
        hashmap.put("a", "b");
        hashmap.put("b", "c");
        hashmap.put("m", "i");

        hashmap.forEach((k, v) -> {
            System.out.format("key: %s, value: %s", k, v);
        });

        Map<String, String> capitals = new HashMap<>();

        capitals.put("svk", "Bratislava");
        capitals.put("ger", "Berlin");
        capitals.put("hun", "Budapest");
        capitals.put("czk", "Prague");
        capitals.put("pol", "Warsaw");
        capitals.put("ita", "Rome");

//        System.out.format(capitals.entrySet().stream().filter(map ->  map.getValue().startsWith("B"))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        Map<String, String> filteredCapitals = capitals.entrySet().stream()
                .filter(map ->  map.getValue().startsWith("B"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        filteredCapitals.entrySet().forEach(System.out::println);

    }
}