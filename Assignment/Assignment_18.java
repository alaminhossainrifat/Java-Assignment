import java.util.Scanner;

/**
 * Assigment 18 (Print the day name)
 * declare an array of weekdays 
 * User will give a day number you have to print the equivalent day name
 * 
 * Example 1
 * input-> Enter day number (1-7) : 1
 * output-> Monday
 * 
 * Example 2
 * input-> Enter day number (1-7) : 3
 * output-> Wednesday
 */

public class Assignment_18 {

    public static void main(String[] args) {
        
        String[] weekdays= new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day number (1-7) : ");
        int day = input.nextInt();

        for (int i = 0; i < weekdays.length; i++) {
            if (day == i+1) {
                System.out.println(weekdays[i]);
                break;
            }
        }

        if (day > weekdays.length) {
            System.out.println("Wrong Number");
        }
        if (day ==0) {
            System.out.println("Please Select 1-7");
        }

    }
}