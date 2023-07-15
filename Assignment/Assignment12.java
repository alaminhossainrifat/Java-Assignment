// print sum of odd numbers from m-n

import java.util.Scanner;

/**
 * Assignment12
 */
public class Assignment12 {

    public static void main(String[] args) {
        
        int m,n,sum=0;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter Starting Number: ");
        m = input.nextInt();

        System.out.print("Enter Ending Number: ");
        n = input.nextInt();


        for (int i=m; i<=n; i++)
        {
            if(i%2!=0)
            {
                sum+=i;
            }
            
        }

            System.out.println("Sum of odd number from "+m+" to " +n+" : "+sum);

        
    }
}