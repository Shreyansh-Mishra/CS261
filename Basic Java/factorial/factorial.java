/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        long i, n;
        System.out.print("Enter the number whose factorial you want to print: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        //if the number is 0 or 1, print 1 becuase 0! and 1! = 1
        if (n == 0 || n == 1) {
            System.out.println(1);
        } else {
            //else, loop from the number-1 till 0, and multiply the number itself by the loop variable
            for (i = n - 1; i > 0; i--) {
                n *= i;
            }
            //print the number
            System.out.println(n);
        }
    }
}