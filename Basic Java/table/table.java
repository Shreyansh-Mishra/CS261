/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class table {
    public static void main(String[] args) {
        long i;
        //take input
        System.out.print("Enter the number whose table you want to print: ");
        Scanner input = new Scanner(System.in);
        long n = input.nextInt();
        //loop till 10, and print the multiplication of the number every step
        for(i=1;i<=10;i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}