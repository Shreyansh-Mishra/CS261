/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        int n;
        //take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        //if n is odd, it returns 1 as a remainder when divided by 2
        if(n%2==1){
            System.out.println(n + " is an odd number");
        }
        //else, it's an even number
        else{
            System.out.println(n + " is an even number");
        }
    }
}