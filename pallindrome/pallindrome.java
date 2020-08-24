/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        //take input
        System.out.print("Enter a number: ");
        n = input.nextInt();
        int m = n;
        int rev = 0, r = 0;
        //logic to reverse a number
        while(n!=0){
            r = n % 10;
            rev = (rev*10) + r;
            n /= 10;
        }
        //if the reverse of the number is the number itself, its a palindrome 
        if(rev == m){
            System.out.print(m + " is a pallindrome");
        }
        else{
            System.out.print(m +" is not a pallindrome");
        }
    }
}