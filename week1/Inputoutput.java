package week1;
import java.util.Scanner;
// or  import java.util.*;

public class Inputoutput {
    public static void main(String[] args) {
        // user output
        System.out.println("The sentence will have line break");
        // System.out.print
        System.out.print("This will not have break");
        System.out.print("this line will continue. \n");

        // string formatting using System.out.printf;
        // %s String, %d Intergral, %f floating point, %b boolean
        // this will also not break line

        System.out.printf("hello %s, good morning","world");
        System.out.printf("The number is %d",10);
        // can use multiple formatter
        System.out.printf("\n The floating %f and boolean %b",10.3f,false);


        // User input
        // import java.util.Scanner;copy this line at the top
        Scanner scan= new Scanner(System.in);
        System.out.println("The following take whole sentence");
        String wholeoutput= scan.nextLine();
        System.out.println("The input taken is "+ wholeoutput);
        System.out.println("The following takes interger");
        int intInput=scan.nextInt();
        System.out.println("The input taken is "+ intInput);
        System.out.println("The following takes double ");
        double doubleInput=scan.nextDouble();
        System.out.println("The input taken is "+ doubleInput);
        System.out.println("The following takers boolean");
        boolean booleanInput=scan.nextBoolean();
        System.out.println("The input taken is "+ booleanInput);
        scan.close();//you must close the scanner once all input is taken




        
    }
}
        