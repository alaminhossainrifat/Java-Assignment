import java.util.Scanner;

// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover

/**
 * Assignment7
 */
public class Assignment7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ;

        System.out.print("Do You Love Java?");
         = input.next().charAt(0);

        if( == 'y' ||  == 'Y'){
            System.out.println("You Are A Java Lover");
        }
        else if( == 'n' ||  == 'N'){
            System.out.println("You Are Not Java Lover");
        }
        else{
            System.out.println("Use Y or N");
        }
    }
}