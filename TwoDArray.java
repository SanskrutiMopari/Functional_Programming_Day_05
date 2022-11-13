package Functional_Programs_Day05;

import java.util.Scanner;

//a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
//standard input and printing them out to standard output.
//b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
//d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
//OutputStreamWriter to print the output to the screen.

public class TwoDArray {
    public static void main(String[] args) {

        int m, n, i, j;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        m = scan.nextInt();
        System.out.print("Enter Number of Columns: ");
        n = scan.nextInt();
        int array[][] = new int[m][n];
        System.out.println("Enter The Value of Array: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("Two D Array is: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
