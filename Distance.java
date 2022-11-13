package Functional_Programs_Day05;

import java.util.Scanner;

//Write a program Distance.java that takes two integer command-line arguments x
//and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
//formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

public class Distance {
    public static void main(String args[]) {

        int x1, x2, y1, y2;

        double dis;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 Point: ");
        x1 = sc.nextInt();
        System.out.println("Enter y1 Point:");
        y1 = sc.nextInt();
        System.out.println("Enter x2 Point");
        x2 = sc.nextInt();
        System.out.println("Enter y2 Point");
        y2 = sc.nextInt();
        dis = Distance.calDis(x1, y1, x2, y2);
        System.out.println("Distance :" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===" + dis);
    }

    static double calDis(int x1, int y1, int x2, int y2) {
        return (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }
}
