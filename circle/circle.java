import java.util.*;
public class circle {
   public static void main(String args[]){
        float r=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        r = input.nextInt();
        System.out.println("Area of the Circle: " + Math.PI*r*r);
        System.out.println("Circumference of the Circle: " + Math.PI*r*2);
   } 
}