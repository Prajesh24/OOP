package week3;
import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        // 1. Write a JAVA program to find the maximum between three numbers.
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        if (num1>num2 & num1>num3) {
            System.out.println("The maximum number is "+ num1);
            
        }
        else if (num2>num1 & num2>num3) {
            System.out.println("The maximum number is "+ num2);
            
        }
        else{
            System.out.println("The maximum number is "+ num3);
            
        }

        // 2. Write a JAVA program to check whether a number is negative, positive, or zero.
        System.out.println("Enter a number");
        int num=scan.nextInt();
        if(num>0){
            System.out.println("it is a positive number");
        }
        else if(num==0){
            System.out.println("it is zero");
        }
        else{
            System.out.println("it is a negative number");
        }

        // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not
        System.out.println("enter a number");
        int number=scan.nextInt();
        if(number%5==0 & number%11==0){
            System.out.println("it is divisible y 5 and 11 ");
        }
        else{
            System.out.println("it is not divisible by 5 and 11");
        }

        // 4. Write a JAVA program to check whether a number is even or odd.
        System.out.println("Enter a number");
        int a=scan.nextInt();
        if (a%2==0) {
            System.out.println("it is a even number");
            
        }
        else{
            System.out.println("it is a odd number");
        }

        // 5. Write a JAVA program to check whether a year is a leap year or not. 
        // Hint: if year%4==0; if year%100!==0 ; year%400==0; 
            
        System.out.println("Enter a year");
        int year=scan.nextInt();
        if (year%4==0 & year%100!=0 & year%400==0) {
            System.out.println("it is a leap year");
            
        }
        else{
            System.out.println("it is not a leap");
        }

        // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
        System.out.println("Enter any alphabet");
        char alpha=scan.next().charAt(0);
        alpha=Character.toLowerCase(alpha);
        if (alpha =='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u') {
            System.out.println("it is a vowel");   
        }
        else{
            System.out.println("it is a consonant");
        }

        // Some Switch case Statements Questions:
        // 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.

        System.out.println("Enter the your grades from A to F");
        char  grade = scan.next().charAt(0);
        grade=Character.toUpperCase(grade);
        switch (grade) {
            case 'A':
                System.out.println("GPA: 3.6");
                break;
            case 'B':
                System.out.println("GPA: 3.2");
                break;
            case 'C':
                System.out.println("GPA: 2.8");
                break;
            case 'D':
                System.out.println("GPA: 2.4");
                break;
            case 'F':
                System.out.println("GPA: 2.0 failll");
                break;
            }

        // 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.
            System.out.println("Enter Two Numbers");
            int firstNum=scan.nextInt();
            int secondNum=scan.nextInt();
            System.out.println("Enter an operator for arithmetic operation");
            char operator=scan.next().charAt(0);
            switch (operator) {
                case '+':
                    int add=firstNum+secondNum;
                    System.out.println("the result is "+ add);
                    break;
                case '-':
                    int subtract=firstNum-secondNum;
                    System.out.println("The result is "+ subtract);
            
                    break;
                case '*':
                    int multiplication=firstNum*secondNum;
                    System.out.println("The result is "+ multiplication);
            
                    break;
                case '/':
                    int division=firstNum/secondNum;
                    System.out.println("The result is "+ division);
            
                default:
                    break;
            }


            // 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.

            System.out.println("Enter months in numbers from 1 to 12");
            int month=scan.nextInt();
            switch (month) {
                case (1) :
                case (2) :
                case (3) :
                    System.out.println("winter season"); 
                    break;
                case (4) :
                case (5) :
                case (6) :
                    System.out.println("Spring season"); 
                    break;
                case (7) :
                case (8) :
                case (9) :
                    System.out.println("Summer season"); 
                    break;
                case (10) :     
                case (11) :      
                case (12) :
                    System.out.println("Fall season"); 
                    break;
               
        
            }

            // 4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.
            System.out.println("Enter the shape of which you want its area");
            String shape=scan.nextLine();
            shape.toLowerCase();
            switch (shape) {
                case "circle":
                    System.out.println("enter value of radius");
                    int radius=scan.nextInt();
                    float circleArea=2*(22/7)*radius*radius;
                    System.out.println("the area of circle is "+ circleArea);
                    break;
            
                case"rectangle":
                    System.out.println("Enter length and breath of rectangle");
                    int aa=scan.nextInt();
                    int b=scan.nextInt();
                    int rectArea=aa*b;
                    System.out.println("The are of rectangle is "+ rectArea);
                        break;

                case"square":
                System.out.println("Enter length of square");
                int l=scan.nextInt();
                int sqrArea=l*l;
                System.out.println("The area of square is "+ sqrArea);
                break;

                case"triangle":
                System.out.println("Enter base and height of rectangle");
                int base=scan.nextInt();
                int height=scan.nextInt();
                int triArea=(1/2)*base*height;
                System.out.println("The are of triangle is "+ triArea);
                    break;

            }
              
    }
   
}


