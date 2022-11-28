package practice_1;

import java.util.*;
// import java.io.*;
import java.lang.Exception;

public class script8 {

    public static Scanner scan = new Scanner(System.in);
    public static boolean flag = false;
    public static int B = Integer.parseInt(scan.nextLine().trim());
    public static int H = Integer.parseInt(scan.nextLine().trim());

    static {
        try {
            if (B > 0 && H > 0 && B <= 100 && H <= 100) {
                flag = true;
            } else {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        scan.close();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
