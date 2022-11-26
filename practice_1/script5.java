package practice_1;

import java.util.*;
// import java.io.*;
// import java.lang.Math.*;

public class script5 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] arr1 = new int[t][t];
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = a;
            for (int j = 0; j < n; j++) {
                temp = temp + (int) Math.pow(2, j) * b;
                // System.out.printf("%d ", temp);
                arr1[i] = Arrays.copyOf(arr1[i], j + 1);
                arr1[i][j] = temp;
            }
        }
        for (int i = 0; i < t; i++) {
            // System.out.println(Arrays.toString(arr1[i]));
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%d ", arr1[i][j]);
            }
            System.out.printf("\n");
        }
        in.close();
    }
}
