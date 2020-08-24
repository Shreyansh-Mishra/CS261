import java.util.*;
public class primesBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j;
        System.out.print("Enter the lower limit: ");
        int lower = input.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = input.nextInt();
        for (i = lower; i <= upper; i++) {
            boolean flag = false;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }

            if (!flag && i > 1) {
                System.out.print(i + " ");
            }

        }
    }
}