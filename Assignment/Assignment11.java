// find factorial of n
import java.util.Scanner;

/**
 * Assignment11
 */
public class Assignment11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Enter Any Number: ");
        number = input.nextInt();
        double fact=1;
        
        for(int i=1; i<=number; i++)
        {
            fact*=i;
        }
        System.out.println("Factorial Of N =" +fact);

    }
}