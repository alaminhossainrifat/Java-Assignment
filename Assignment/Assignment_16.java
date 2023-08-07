import java.util.Scanner;

/**
 * Assignment_16
 * validate user based on username and password
 * input username and password until username=="anis" and password=="123456"
 * if username and password does not match print "username/password is incorrect. Please try again"
 * if username and password does not match print "welcome to the system"
 */
public class Assignment_16 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int password;
        String name;

        for (int i = 0; i < 20; i++) {
            
            System.out.print("Enter Your Username: ");
            name = input.nextLine();

            System.out.print("Enter Password: ");
            password = input.nextInt();

            if ( name.equals("Rifat") && password==12345678 ) {
                
            System.out.println("welcome to the system");
            break;
            
            }
            
            else{
                System.out.println("username/password is incorrect. Please try again");
            }
        }


    }
}
