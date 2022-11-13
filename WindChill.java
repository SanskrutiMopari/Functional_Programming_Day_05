package Functional_Programs_Day05;

import java.util.Scanner;

//Write a program WindChill.java that takes two double command-line arguments t
//and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
//temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
//National Weather Service defines the effective temperature (the wind chill) to be:

public class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Temperature input
        System.out.print("Enter the Temperature in Fahrenheit between -58°F and 41°F: ");
        float t_A = input.nextFloat();
        //Wind Speed
        System.out.print("Enter the Wind Wpeed (>=2) in Miles Per Hour: ");
        float v_c = input.nextFloat();
        //Formulae
        double twc = 35.74 + 0.6215 * t_A - 35.75 * Math.pow(v_c, 0.16) + 0.4275 * t_A * Math.pow(v_c, 0.16);
        //Display
        System.out.printf("The WindChill index is: %.3f", twc);
    }
}
