package Scripts;
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class algo_bs_1 {

    // recursive function
    public static boolean binarySearchRecursive1(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = (left + right) / 2;
        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return binarySearchRecursive1(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive1(array, x, mid + 1, right);
        }
    }

    public static boolean binarySearchRecursive1(int[] array, int x) {
        return binarySearchRecursive1(array, x, 0, array.length - 1);
    }

    // iterative function
    public static boolean binarySearchRecursive2(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2); // to handle overflow issue
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("TESTING");
    }

}