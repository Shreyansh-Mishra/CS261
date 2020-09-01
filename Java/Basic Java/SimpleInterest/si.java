/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class si {
   public static void main(String args[]){
        float p=0,r=0,t=0;
        //take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        p = input.nextInt();
        System.out.print("Enter Rate: ");
        r = input.nextInt();
        System.out.print("Enter Time: ");
        t = input.nextInt();
        //print out the Simple Interest by the formula "SI = (Principle*Rate*Time)/100"
        System.out.println("Simple Interest: " + (p*r*t)/100);
   } 
}