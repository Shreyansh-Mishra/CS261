/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class rectangle {
   public static void main(String args[]){
        float l=0,b=0;
        //take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle: ");
        l = input.nextInt();
        System.out.print("Enter the Breadth of Rectangle: ");
        b = input.nextInt();
        //print the area of the rectangle with formula "area = length * breadth"
        System.out.println("Area of the Rectangle: " + l*b);
        
   } 
}