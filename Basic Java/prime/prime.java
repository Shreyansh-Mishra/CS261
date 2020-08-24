/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class prime {
    public static void main(String[] args) {
        int i, n;
        //take input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be checked whether it is prime or composite: ");
        n = input.nextInt();
        if (n>1) {
            //loop till half of the number
            for(i=2;i<=n/2;i++){
                //if any number divides it, its not a prime number      
                if(n%i==0){
                    System.out.println(n + " is a composite number.");
                    //break program execution
                    System.exit(0);
                }
            }
        }
        //numbers below 1(inclusive) are neither composite nor prime
        else {
            System.out.println(n + " is neither composite, nor a prime.");
            System.exit(0);

        }
        //if the number is greater than 1, and not a composite number, its a prime number.
        System.out.println(n + " is a prime number.");
    }
}