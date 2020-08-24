import java.util.*;
public class f_to_c {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        celsius = (fahrenheit - 32) * (0.5556);
        System.out.println(fahrenheit + "F Fahrenheit is " + celsius + "C in Celsius Scale.");
    }
}