package algos;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void matrixMultiplication(int[][] arr1, int[][] arr2) {

        int m1_row = arr1.length;
        int m1_column = arr1[0].length;

        int m2_row = arr2.length;
        int m2_column = arr2[0].length;

        if(m1_column != m2_row)
            return;
        int[][] ans = new int[m1_row][m2_column];



        for(int i=0;i<m1_row;i++) {
            for(int j=0;j<m1_column;j++) {
                for(int k =0;k<m2_column;k++){
                    ans[i][k] = ans[i][k] + arr1[i][j] * arr2[j][k];
                }

            }
        }

        for(int i=0;i<m1_row;i++){
            for(int j=0;j<m2_column;j++)
                System.out.print(ans[i][j] + " ");

            System.out.println();
        }







    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1_row = sc.nextInt();
        int m1_column = sc.nextInt();

        int m2_row = sc.nextInt();
        int m2_column = sc.nextInt();

        int[][] arr1 = new int[m1_row][m1_column];
        int[][] arr2 = new int[m2_row][m2_column];

        for(int i=0;i<m1_row;i++) {
            for(int j=0;j<m1_column;j++)
                arr1[i][j] = sc.nextInt();
        }
        for(int i=0;i<m2_row;i++) {
            for(int j=0;j<m2_column;j++)
                arr2[i][j] = sc.nextInt();
        }
        matrixMultiplication(arr1,arr2);

    }
}
