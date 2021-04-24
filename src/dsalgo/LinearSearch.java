package algos;

import java.util.Scanner;
//Program to search an element in an Array

public class LinearSearch {

    public static int LinearSearch(int[] arr, int element) {
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == element)
                return i;
        }
        for(int i: arr) {
            if(i == element)
                return i;
        }
        return -1;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] testArr = new int[n];
        int i = 0;
        while(i < n){
            testArr[i] = sc.nextInt();
            i++;
        }
        int element = sc.nextInt();

        System.out.println("Index: " + LinearSearch(testArr,element));

    }
}
