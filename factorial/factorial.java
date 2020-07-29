import java.util.*;
public class factorial {
    public static void main(String[] args) {
        long i, n;
        System.out.print("Enter the number whose factorial you want to print: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(1);
        } else {
            for (i = n - 1; i > 0; i--) {
                n *= i;
            }
            System.out.println(n);
        }
    }
}