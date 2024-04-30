package week2;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        // task
        // make a new scanner object scan1
        // prompt the following and take ooutput
        // what is you name? save the input to string= name
        // Are you over 18? save the  input to boolean=status
        // how many siblings? save the input to integer=siblings
        // print the following
        // hello name,
        // Over 18?,status
        // You have sibling number of sibling


        Scanner scan1= new Scanner(System.in);
        System.out.println("What is you name");
        String name=scan1.nextLine();
        System.out.println("Hello "+ name);
        System.out.println("Are you over 18?");
        boolean status= scan1.nextBoolean();
        System.out.println("Over 18?, "+ status);
        System.out.println("How many siblings?");
        int sibling=scan1.nextInt();
        System.out.println("You have sibling number of "+ sibling);

    }
    
}
