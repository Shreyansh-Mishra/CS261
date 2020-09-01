/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class digitsum {
    public static void main(String[] args) {
        //take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers whose sum of digits is to be calculated: ");
        int n = input.nextInt();
        int number = n;
        int sum = 0;
        while (n > 0) {
            //get the last digit
            int digit = n % 10;
            //remove the last digit from the number
            n = n / 10;
            //add the digit to sum variable
            sum += digit;
        }
        //print the sum variable
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}