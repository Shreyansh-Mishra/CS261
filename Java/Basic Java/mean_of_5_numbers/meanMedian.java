/*
Name: Shreyansh Mishra
Roll Number: 201951146
*/
import java.util.*;
class meanMedian{
    public static void main(String args[])
    {
        int i=0;
        float n=0, median=0;
        Scanner input = new Scanner(System.in);
        int a[];
        a = new int[5];
        System.out.print("Enter 5 numbers: ");
        for(i=0;i<5;i++){
            //take input
            //append the input to an array
            a[i] = input.nextInt();
            //add the input to a variable n
            n+=a[i];
        }
        Arrays.sort(a);
        //print out n/5, where n is the sum of all the elements
        System.out.println("Mean of the Data is: " + n/5);
        //print out the 3rd element (2nd index) of the sorted array, as its the median
        median = a[2];
        System.out.println("Median of the Data is: " + median);

    }
}