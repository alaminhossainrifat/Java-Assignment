import java.util.Scanner;

/**
 * Assignment_17
 * 
 * Create a pattern like following one if n=4
 1
 1 0
 1 0 1
 1 0 1 0
 */

public class Assignment_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col % 2);
            }
            System.out.println();
        }
    }
}