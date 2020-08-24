/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class armstrongnumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
        //take input
        int n = input.nextInt();
        int number = n;
        //initialize sum variable which will store the sum of cubes of the digits
        int sum = 0;
        while (number > 0) {
            //get the last digit
            int digit = number % 10;
            //remove the last digit from the number
            number = number / 10;
            //add cube of the digit to sum variable
            sum += digit*digit*digit;
        }
        //if sum of cubes of digits is equal to original number
        if (n==sum) {
            System.out.println(n + " is an Armstrong Number.");

        }
        else {
            System.out.println(n + " is not an Armstrong Number.");
        }
    }
}