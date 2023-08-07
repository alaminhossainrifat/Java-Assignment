import java.util.Scanner;

/**
 * Assignment_15
 * 
 * 1. generate and print armstrong numbers from m-n
 * 2. count and print number of armstrong numbers
 */
public class Assignment_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m, n, r, i, temp, count=0, sum=0;

        System.out.print("Enter Initial Number: ");
        m = input.nextInt();

        System.out.print("Enter Final Number: ");
        n = input.nextInt();

        System.out.print("Armstrong Number from "+m+" to "+n+" are: ");

        for ( i = m; i <=n; i++) {
            
            temp = i;
        
        while (temp!=0) {
            r = temp % 10;
            sum = sum + r*r*r;
            temp = temp/10;
        }
        if (i ==sum) {
            System.out.print(i+" ");
            count++;
        }
        sum = 0;

        }

        System.out.println();
        System.out.print("Total Armstronge Number from "+m+" to "+n+" are " +count);


         
    }
}