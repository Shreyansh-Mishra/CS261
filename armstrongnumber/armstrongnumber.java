import java.util.*;
public class armstrongnumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
        int n = input.nextInt();
        int number = n;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            sum += digit*digit*digit;
        }
        if (n==sum) {
            System.out.println(n + " is an Armstrong Number.");

        }
        else {
            System.out.println(n + " is not an Armstrong Number.");
        }
    }
}