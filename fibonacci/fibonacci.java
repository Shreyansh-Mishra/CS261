/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        //previous number
        long a=0;
        //next number
        long b=1;
        long c;
        //take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements to be printed: ");
        long n = input.nextInt();
        //loop till n times
        for (long i=0;i<n;i++) {
            //print the next number of the sequence
            System.out.print(b + " ");
            //assign c to sum of previous and next element
            c = a + b;
            //assign the previous element the value of next element
            a = b;
            //assign the next element to the sum of the previous and itself
            b = c;
        }
    }
}