import java.util.Scanner;


public class QuickSort {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);


        int j = 0;
        while(j<n)
            System.out.println(arr[j++]);
    }

    private static void quickSort(int[] arr, int low, int high) {

        if(low >= high)
            return;

        int pi = partition(arr,low,high);
        quickSort(arr, low,pi-1);
        quickSort(arr, pi+1,high);

    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while(low<high) {

            while(low<high && arr[high] >=  pivot)
                high--;

            swap(arr,low,high);
            while(low<high && arr[low] <= pivot)
                low++;
            swap(arr,high,low);

        }
        // swap(nums,low,j);
        arr[low] = pivot;

        return low;
    }
}
