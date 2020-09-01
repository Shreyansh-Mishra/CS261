/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class f_to_c {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        //take input for fahrenheit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        //find the temperature in celsius using a formula
        celsius = (fahrenheit - 32) * (0.5556);
        System.out.println(fahrenheit + "F Fahrenheit is " + celsius + "C in Celsius Scale.");
    }
}