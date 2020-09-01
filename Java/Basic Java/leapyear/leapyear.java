/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        //if year is divisible by 400 or 4, its an lear year, but if its divisble by 100, its not an leap year.
        boolean flag = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)); 
        if (flag) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + "is not a leap year.");
        }
    }
}