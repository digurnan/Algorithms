package algos;

import java.util.*;

class LRUCache {

    private int capacity;
    private LinkedList<Integer> list;
    private Map<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.list = new LinkedList<>();
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            list.remove(Integer.valueOf(key));
            list.addFirst(key);
        }
        Integer value = map.get(key);
        if (value == null)
            return -1;
        else return value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            list.remove(Integer.valueOf(key));
            list.add(key);
        } else if (list.size() >= capacity) {
            int evicted = list.remove(0);
            map.remove(evicted);
            list.add(key);
        } else {
            list.add(key);
        }
        map.put(key, value);
    }


    public static void main(String args[]) {

        System.out.println("hello");
        LRUCache obj = new LRUCache(3);

        obj.put(4,1);
        int param_1 = obj.get(4);
        System.out.println(param_1);

        System.out.println("hello again");
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */