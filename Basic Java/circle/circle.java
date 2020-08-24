/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class circle {
   public static void main(String args[]){
        float r=0;
        //take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        r = input.nextInt();
        //print out the area with formula pi*r^2
        System.out.println("Area of the Circle: " + Math.PI*r*r);
        //print out the circumference with formula 2*pi*r
        System.out.println("Circumference of the Circle: " + Math.PI*r*2);
   } 
}