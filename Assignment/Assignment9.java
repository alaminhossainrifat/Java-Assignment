import java.util.Scanner;

/**
 * Assignment9
 * switch assignment: call center
 * if user select option 1 then set language bengali
 * if user select option 2 then set language hindi
 * if user select option 3 then set language urdu
 * for any other option set language english
 */
public class Assignment9 {

    public static void main(String[] args) {
        System.out.println("Select Any Option");
        System.out.println("Option:1.Bengali");
        System.out.println("Option:2.Hindi");
        System.out.println("Option:3.Urdu");
        System.out.println("Option:4.English");

        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter Number:");
        num = input.nextInt();

        switch (num) {
            case 1:{
                System.out.println("Selected language is Bengali");
            }
                
                break;

            case 2:{
                 System.out.println("Selected language is Hindi");
            }
                    
                break;

            case 3:{
                 System.out.println("Selected language is Urdu");
            }
                break;

            case 4:{
                 System.out.println("Selected language is English");
            }
                    
                 break;
        
            default:{
                System.out.println("Select Only 1-4");
            }
                break;
        }

    }
}
