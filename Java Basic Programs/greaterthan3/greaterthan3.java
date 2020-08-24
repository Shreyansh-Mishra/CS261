import java.util.*;
public class greaterthan3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        System.out.print("Enter third number: ");
        c = input.nextInt();
        if(a>b){
            if(a>c){
                System.out.print(a + " is the largest number");
            }
            else{
                System.out.print(c + " is the largest number");
            }
        }
        else if(b>c){
            System.out.print(b + " is the largest number");
        }
        else{
            System.out.print(c + " is the largest number");
        }
   } 

}
