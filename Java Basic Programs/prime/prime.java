import java.util.*;
public class prime {
    public static void main(String[] args) {
        int i, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be checked whether it is prime or composite: ");
        n = input.nextInt();
        if (n>1) {
            for(i=2;i<=n/2;i++){      
                if(n%i==0){
                    System.out.println(n + " is a composite number.");
                    System.exit(0);
                }
            }
        }
        else {
            System.out.println(n + " is neither composite, nor a prime.");
            System.exit(0);

        }
        System.out.println(n + " is a prime number.");
    }
}