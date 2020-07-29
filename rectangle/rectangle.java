import java.util.*;
public class rectangle {
   public static void main(String args[]){
        float l=0,b=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle: ");
        l = input.nextInt();
        System.out.print("Enter the Breadth of Rectangle: ");
        b = input.nextInt();
        System.out.println("Area of the Rectangle: " + l*b);
        
   } 
}