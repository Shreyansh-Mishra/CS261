import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = input.nextInt();
        if(n%2==1){
            System.out.println(n + " is an odd number");
        }
        else{
            System.out.println(n + " is an even number");
        }
    }
}