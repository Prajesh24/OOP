package week2;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        // 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.
        Scanner scan1= new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age=scan1.nextInt();
        // if (age>18) {
        //     System.out.println("you are eliglible for voting");
            
        // }
        // else{
        //     System.out.println("Your are not eliglible for voting");
        // }

        // 2. Write a program to calculate SI. 
        // Formula Simple Interest = (PrincipleAmount*Time*Rate/100);

        // System.out.println("Enter Princile Amount");
        // int Amount=scan1.nextInt();
        // System.out.println("Enter Time in years");
        // int time=scan1.nextInt();
        // System.out.println("Enter Rate");
        // float rate=scan1.nextFloat();
        // float Simple_Interest=(Amount*time*rate)/100;
        // System.out.println("The simple interest is "+ Simple_Interest);


        // 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        // Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;
        // System.out.println("Enter the base of triangle");
        // int base=scan1.nextInt();
        // System.out.println("Enter the height of triangle");
        // int height=scan1.nextInt();
        // int area=1/2*(base*height);
        // System.out.println("The area of triangle is "+ area);
        // System.out.println("Enter the length of cuboid");
        // System.out.println("Enter the width of cuboid");
        // System.out.println("Enter the height of cuboid");
        // int length=scan1.nextInt();
        // int width=scan1.nextInt();
        // int cheight=scan1.nextInt();
        // int volume=length*width*cheight;
        // System.out.println("the volume of cuboid is "+volume);
        // System.out.println("Enter the side of cube");
        // int side=scan1.nextInt();
        // int volumeCube=side*side*side;
        // System.out.println("The volume of cube is "+volumeCube);

        // 4. Write the ternary operator for question no. 1
        // System.out.println("Enter your age");
        // int age1=scan1.nextInt();
        // String a=(age1>18)? "You are eliglible for voting":"You are not eliglible for voting";
        // System.out.println(a);

        // 5. Write a program to take two integer inputs from the user and print the sum and product of them.
        // System.out.println("Enter two numbers");
        // int num1=scan1.nextInt();
        // int num2=scan1.nextInt();
        // System.out.println("The sum of these two numbers is "+ (num1+num2));
        // System.out.println("The product of these two numbers is "+ (num1*num2));

        // 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result.
        // float division=num1/num2;
        // System.out.println("The divsion of sum and product is "+ division);

        // 7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.
        // System.out.println("Enter your name");
        // String name=scan1.nextLine();
        // System.out.println("Enter your Roll number");
        // int roll=scan1.nextInt();
        // scan1.nextLine();
        // System.out.println("Enter your feild of interest");
        // String field=scan1.nextLine();
        // System.out.println("Hey, my name is " +name +"and my roll number is "+roll+". My field of interest are "+field+".");


        // 8. Take side of a square from user and print area and perimeter of it.
        // System.out.println("Enter the side of a square");
        // int sideSquare=scan1.nextInt();
        // float areaSquare=sideSquare^2;
        // float perimeter=2*sideSquare;
        // System.out.println("The area of square is "+ areaSquare);
        // System.out.println("The perimeter of square is "+ perimeter);

        // 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

        // System.out.println("enter the length of rectangle");
        // int recLength=scan1.nextInt();
        // scan1.nextLine();
        // System.out.println("enter the breadth of rectangle");
        // int recBreadth=scan1.nextInt();
        // int recArea=recLength*recBreadth;
        // System.out.println("The area of rectangle is "+ recArea);


        // 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;\
        // a. If equal to or more than 70 -> First Class
        // b. If more than 59 -> Upper Second Class
        // c. If more than 49 -> Second class
        // d. If more than 39 -> Third class and if below than 40 the result is fail. 
        // Hint: Use ternary operator

        System.out.println("Enter your marks of 4 subjects");
        float firstSub=scan1.nextFloat();
        float secondSub=scan1.nextFloat();
        float thirdSub=scan1.nextFloat();
        float fourthSub=scan1.nextFloat();
        float total=firstSub+secondSub+thirdSub+fourthSub;
        float percentage=total/4;
        // String result=(percentage>=70)? "First class";
        // System.out.println((percentage>59)? "Upper second class":"");
        // System.out.println((percentage>49)? "second class":"");
        // System.out.println((percentage>39)? "Third class":"fail");





        
    }
    
}
