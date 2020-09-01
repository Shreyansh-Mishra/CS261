/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class primesBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j;
        //take input
        System.out.print("Enter the lower limit: ");
        int lower = input.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = input.nextInt();
        //loop between the range
        for (i = lower; i <= upper; i++) {
            //flag to check whether the number is prime or composite after a loop
            boolean flag = false;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    //if the number is not prime, the flag becomes true
                    flag = true;
                }
            }
            //if the flag is not true, its a prime number
            if (!flag && i > 1) {
                //print out the number with a leading whitespace
                System.out.print(i + " ");
            }

        }
    }
}