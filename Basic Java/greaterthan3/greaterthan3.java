/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class greaterthan3 {
    public static void main(String[] args) {
        int a,b,c;
        //take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        System.out.print("Enter third number: ");
        c = input.nextInt();
        //if a is larger than both of the other numbers
        if(a>b){
            if(a>c){
                System.out.print(a + " is the largest number");
            }
            //if a>b but less than c, then c is the largest
            else{
                System.out.print(c + " is the largest number");
            }
        }
        //if b is greater than a and c
        else if(b>c){
            System.out.print(b + " is the largest number");
        }
        //else c is the largest
        else{
            System.out.print(c + " is the largest number");
        }
   } 

}
