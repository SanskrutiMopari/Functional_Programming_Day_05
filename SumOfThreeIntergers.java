package Functional_Programs_Day05;

//Sum of three Integer adds to ZERO
//a. Desc -> A program with cubic running time. Read in N integers and counts the
//number of triples that sum to exactly 0.
//b. I/P -> N number of integer, and N integer input array
//c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
//d. O/P -> One Output is number of distinct triplets as well as the second output is to
//print the distinct triplets.

public class SumOfThreeIntergers {
    public static void main(String[] args) {
        int givenArray[] = {1, 2, 3, -3, -1, 5,};

        for (int i = 0; i < givenArray.length; i++) {
            for (int j = i + 1; j < givenArray.length; j++) {
                for (int k = j + 1; k < givenArray.length; k++) {
                    if (givenArray[i] + givenArray[j] + givenArray[k] == 0) {
                        System.out.println("Numbers found : " + givenArray[i] + "," + givenArray[j] + " and " + givenArray[k]);
                    }
                }
            }
        }
    }
}
