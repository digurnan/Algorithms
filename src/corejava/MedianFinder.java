package corejava;
import java.io.*;
import java.util.*;
class MedianFinder {
    static PriorityQueue<Integer> minHeap;
    static PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<Integer>();
        maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    }

    // Adds a number into the data structure.
    public static void addNum(int num) {
        if(minHeap.size()==0 && maxHeap.size() ==0)
            minHeap.add(num);

        if(minHeap.size() > maxHeap.size()) {

            if(num > minHeap.peek())
            {
                maxHeap.add(minHeap.poll());
                minHeap.add(num);
            }
            else
                maxHeap.add(num);
        } else {
            if (minHeap.size() < maxHeap.size()) {
                if (num < maxHeap.peek()) {
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(num);
                } else
                    minHeap.add(num);
            } else {
                if (minHeap.size() == maxHeap.size()) {
                    if (num > minHeap.peek())
                        minHeap.add(num);
                    else
                        maxHeap.add(num);
                }
            }
        }
    }

    // Returns the median of current data stream
    public static double findMedian() {
        if (minHeap.size() == maxHeap.size()) {
            return (double) (minHeap.peek() + maxHeap.peek()) / 2;
        } else if (minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        } else {
            return maxHeap.peek();
        }
    }

    public static void main(String[] args) {

        MedianFinder m = new MedianFinder();
        addNum(1);
        addNum(3);
        addNum(7);
        addNum(9);
        addNum(2);
        addNum(10);
        addNum(12);

        for(int i : minHeap)
            System.out.print(i + " ");
        System.out.println();
        for(int j : maxHeap)
            System.out.print(j + " ");

        System.out.println();
        System.out.println(findMedian());
    }
}