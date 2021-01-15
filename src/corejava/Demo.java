package corejava;

//a simple program to demonstrate the use of stream in java
import java.util.*;
        import java.util.stream.*;

class Demo
{
    public static void main(String args[])
    {
        HashMap<String,Integer> hashmap = new HashMap<>();

        hashmap.put("a" , 1);
        hashmap.put("b" , 1);
        hashmap.put("c" , 1);

        System.out.println(hashmap.get("a"));

        System.out.println(hashmap.getOrDefault("c",0));

        hashmap.put("d",hashmap.getOrDefault("d",0));

        System.out.println(hashmap.get("d"));

        hashmap.clear();
        hashmap.put("a", 2);

        for(Map.Entry<String,Integer> entry : hashmap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        for (String name : hashmap.keySet())
            System.out.println("key: " + name);

        // using values() for iteration over keys
        for (Integer url : hashmap.values())
            System.out.println("value: " + url);

        hashmap.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

        Iterator<Map.Entry<String, Integer>> itr = hashmap.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }


        System.out.println(hashmap.isEmpty());

        System.out.println(hashmap.size());

        System.out.println(hashmap.remove("b"));

        System.out.println(hashmap.size());

     //   hashmap.compute("a",2);



        hashmap.putIfAbsent("c",5);

        itr = hashmap.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
//        hashmap.computeIfAbsent("",1);
//        hashmap.computeIfPresent("",1);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put(null, "10");
        map.put("10", null);

        System.out.println("map before compute = "+map);
        for (String key : map.keySet()) {
            map.compute(key, (k,v) -> {return k+v;});
        }
        map.compute("5", (k,v) -> {return k+v;}); //key not present, v = null
        System.out.println("map after compute = "+map);


        PriorityQueue<Integer> minHeap = new PriorityQueue<>();


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(1);
        maxHeap.add(6);
        maxHeap.add(10);
        maxHeap.add(11);
        maxHeap.add(9);

        for(int i: maxHeap) {
            System.out.print(i + " ");
        }
        System.out.println();
        minHeap.add(1);
        minHeap.add(6);
        minHeap.add(10);
        minHeap.add(11);
        minHeap.add(9);

        for(int i: minHeap) {
            System.out.print(i + " ");
        }


    }
}
