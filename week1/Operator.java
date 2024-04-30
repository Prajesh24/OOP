package week1;

public class Operator {
    public static void main(String[] args) {
        // Arithemtic Operator
        int a=10,b=10;
        int sum=a+b; //here the + is an arithemetic operator
        System.out.println("addition for a + b is "+sum);
        System.out.println("subtraction for a - b is "+(a-b));
        System.out.println("multiplication for a * b is "+(a*b));
        System.out.println("division for a / b is "+(a/b));
        System.out.println("Modul0 for a and b is "+(a%2));

        // Assingment Operator
        int aNumber1;
        aNumber1=10;
        // or declare and assign
        int aNumber2=20;
        // assign woth another variable'
        int aNumber3= aNumber1;
        System.out.println("Assignment with +=" + (aNumber1+=10));
        aNumber2 -=30;// same as aNumber2 = aNumber2 -30
        System.out.println("Assignment with -= "+ aNumber2);


        // relational Operator
        int rNumber1=10,rNumber2=20;
        System.out.println("rNumber1 equals to rNumber2? "+ (rNumber1 == rNumber2));
        System.out.println("rNumber1 greater than rNumber2? "+ (rNumber1 > rNumber2));
        System.out.println("rNumber1 lessthan or equals to rNumber2? "+ (rNumber1 <= rNumber2));
        System.out.println("rNumber1 not equals to rNumber2? "+ (rNumber1 != rNumber2));

        // Logical operators
        int lNumber1=10, lNumber2=12;
        boolean lExpression1 = lNumber1 == lNumber2;
        boolean lExpression2 = lNumber1 <= lNumber2;
        System.out.println("And operator uses && "+ (lExpression1 && lExpression2));
        System.out.println("Or operator uses || "+ (lExpression1 || lExpression2));
        System.out.println("Not operator uses ! "+ (!lExpression1));

        //unary operator
        int uNumber1=10;
        uNumber1++;
        System.out.println("Uniary for increament is ++ "+ uNumber1);
        uNumber1--;
        System.out.println("Unary for decreament is -- " + uNumber1);

        // Ternary operator
        int tNumber1=10, tNumber2=10;
        boolean tExpression = tNumber1==tNumber2;
        
        /*
         * one line if else,see the given example in if else
         * string output;
         * if(tExpression==true){
         * output = "true statement";
         * }else{
         * output="False statement";
         * }
         */
        String output=tExpression ? "True statement" : "False statement";
        /*
         * here we can assign a string out with one expression
         * if expression is true it will return the value after the "?"
         * is the expression is false it will return th value after the ":" 
         */
         int numberOutput = tNumber1<tNumber2 ? 10 : 20;
         System.out.println(output);
         System.out.println(numberOutput);


        //  task 1
        // write a program to print weather a variable is greater or equal to 18
        int v1= 10;
        if(v1>=18){
            System.out.println(v1+" is greater or equal to 18");
        }else{
            System.out.println(v1+" is lessthan 18");
        }

            // task2
            // write a program to print simple interest from variables
            // make 3 variables for amount,time and rate and save the calculation into a variable
            // Formula:
            // si=amount * time * rate/100

        int amount =1000,time=3;
        float rate=3;
        float si;
        si= (amount * time * rate)/1000;
        System.out.println("the simple interest is "+ si);

            // task 3
            // write a program to print the area and perimeter of rectangle
            // a=l*b
            // p=2(l+b)

            int area,length=10,breath=10,perimeter;
            area=length * breath;
            perimeter=2 * (length + breath);
            System.out.println("the area is " + area);
            System.out.println("the perimeter is " + perimeter);


            // task 4 
            // complete task 1 using Ternary operator
            int variable1=10,variable2=18;
            boolean vExpression= variable1 >= variable2;
            String out=vExpression ? "the number is greater or equal to 18": "the number is less than 18";
            System.out.println(out);



        
    }
    
}
