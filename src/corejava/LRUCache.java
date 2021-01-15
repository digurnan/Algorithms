package corejava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class LRUCache {

    int capacity;

    HashMap<Integer,Integer> hashMap;

    ArrayDeque<Integer> deque;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.hashMap = new HashMap<>();
        this.deque = new ArrayDeque<>();

    }

    public int get(int key) {
        if(hashMap.containsKey(key)) {
            deque.remove(key);
            deque.add(key);
            return hashMap.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if(hashMap.containsKey(key)) {
            deque.remove(key);
        }
        if(deque.size() == capacity) {
            deque.poll();
        }

        hashMap.put(key,value);
        deque.add(key);

    }

    public static void main(String[] args) {
        LRUCache obj = new LRUCache(3);
        System.out.println(obj.get(1));
        obj.put(2,3);
        obj.put(5,6);

        System.out.println(obj.get(2));
        obj.put(4,8);
        obj.put(6,9);
        obj.put(10,11);

        System.out.println(obj.get(4));
        System.out.println(obj.get(6));
        System.out.println(obj.get(10));
    }
}
