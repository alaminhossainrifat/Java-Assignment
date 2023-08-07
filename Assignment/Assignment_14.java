import java.util.Scanner;

/**
 * Assignment_14
 */
public class Assignment_14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int m, n, temp, r, i, count=0, sum=0;

        System.out.print("Enter Initial Number: ");
        m= input.nextInt();

        System.out.print("Enter Final Number: ");
        n= input.nextInt();

        System.out.print("Pallindrome numbers from "+m+" to "+n+" are:");


        for (i =m; i <=n; i++) {
            temp=i;
            while (temp!=0) 
            {
                r = temp % 10;
                sum = sum *10 + r;
                temp = temp/10;
            }
            if (sum==i) {
                System.out.print(i+" ");
                count ++;
            }
        
            sum=0;
        }
        System.out.println();
        System.out.println("Total Palindrom Number from "+m+" to "+n+" are:"+count);
    }
}