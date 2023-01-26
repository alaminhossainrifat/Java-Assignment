import java.util.Scanner;

/**
 * InnerAssignment8
 * Logical and assignment
 * Check eligible candidate
 * Step 1: Ask the candidate have you completed your masters? y/n
 * Step 2: Ask the candidate are you fulent in English? y/n 
 * Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
 * Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
 */
public class Assignment8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char letter,letter2;

        System.out.print("Have You Completed Your Master?");
        letter = input.next().charAt(0);
        
        System.out.println("Are You Fulent in English?");
        letter2 = input.next().charAt(0);

        if(letter == 'y' && letter2 == 'y'){
            System.out.println("You are eligible to for the job interview");
        }
        else{
            System.out.println("Sorry!! You are not eligible to for the job");
        }

    }
}