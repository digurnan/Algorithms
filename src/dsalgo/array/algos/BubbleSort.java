package algos;

import java.util.Scanner;

public class BubbleSort {

    public static void BubbleSort(int[] arr) {

        int length = arr.length;

        for(int i=0;i<length;i++) {
            for(int j=0;j<length-i+1;j++){
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
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

        BubbleSort(testArr);
        for(i=0;i<n;i++) {
                System.out.print(testArr[i] + " ");
            }

    }
}
