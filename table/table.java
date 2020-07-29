import java.util.*;
public class table {
    public static void main(String[] args) {
        long i;
        System.out.print("Enter the number whose table you want to print: ")
        Scanner input = new Scanner(System.in);
        long n = input.nextInt();
        for(i=1;i<=10;i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}