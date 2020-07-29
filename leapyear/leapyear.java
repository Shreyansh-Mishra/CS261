import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean flag = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)); 
        if (flag) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + "is not a leap year.");
        }
    }
}