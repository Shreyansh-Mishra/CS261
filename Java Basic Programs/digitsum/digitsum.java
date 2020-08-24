import java.util.*;
public class digitsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers whose sum of digits is to be calculated: ");
        int n = input.nextInt();
        int number = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit;
        }
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}