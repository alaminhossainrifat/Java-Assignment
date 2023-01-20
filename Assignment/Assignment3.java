import java.util.Scanner;

/*
    * Assignment-3 (User Input)
    * step 1: create a class called Product
    * step 2: create a main method
    * step 3: declare variables: id, title, price, description, category
    * step 4: get user input for each variables
    * step 5: print the variables
    */



public class Assignment3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id,price;
        String title,desc,cate;

        System.out.print("Enter Your id: ");
        id = input.nextInt();

        System.out.print("Enter The Title: ");
        title = input.nextLine();

        System.out.print("Enter The Price: ");
        price = input.nextInt();

        System.out.print(" Enter Description");
        desc = input.nextLine();

        System.out.print(" Select Category: ");
        cate = input.nextLine();




        System.out.println("Your Product id  is: "+id);
        System.out.println("Your Product Title is: "+title);
        System.out.println("Your Price is: "+price);
        System.out.println("Description:" +desc);
        System.out.println("Your Product Category"+cate);

        
    }
}