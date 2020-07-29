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
            a[i] = input.nextInt();
            n+=a[i];
        }
        Arrays.sort(a);
        System.out.println("Mean of the Data is: " + n/5);
        median = a[2];
        System.out.println("Median of the Data is: " + median);

    }
}