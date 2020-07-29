import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        long a=0;
        long b=1;
        long c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements to be printed: ");
        long n = input.nextInt();

        for (long i=0;i<n;i++) {
            System.out.print(b + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}