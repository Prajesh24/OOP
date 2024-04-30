package week4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // int count = 0;
    //     while loop takes boolean expression inside()
    //     The loops will run repeatatively when the boolean is true
    //     If the loop is false the loop will end
    // }

    // while (count<5) {
    //     System.out.println("wihile loop "+ count);
    //     ++count;
    // }
    //     // In while loop the condition is checked at the begining
    //     // If the condition is false in initial chack the loop will not run
        
    //     System.out.println("Please type the value between 0-100");
    //     Scanner scan=new Scanner(System.in);
    //     int inputValue=scan.nextInt();
    //     while (inputValue < 0 || inputValue > 100) {
    //         System.out.println("Please input between 0-100");
    //         inputValue=scan.nextInt();
            
    //     }
    //     System.out.println("End loop");
    //     scan.close();

        // task
        // use a while loop and ask a user for an int value,promt user to input negative value,loop until the user input negative value

        System.out.println("Enter a integer");
        Scanner scan=new Scanner(System.in);
        int value=scan.nextInt();
        while (value>0) {
            System.out.println("Enter a negative value");
            value=scan.nextInt();
            
        }



    
}
}
