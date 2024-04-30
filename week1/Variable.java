package week1;

public class Variable {
        // instance variable
        // will need object to access this variable
        // not shared between object
        int instanceVariable =100;
        // static/class variable
        // no need of object,can be called from class
        // shared between the object
        static int staticVariable =20;
    public static void main(String[] args) {
        // Non-premitive data type
        // declaration
        byte byteValue;
        // initialization
        byteValue=100;
        // declaration and  initialization
        short shortValue = 200;
        // multiple declaration
        int intValue1, intValue2;
        intValue1=10000;
        intValue2=2000;
        // multiple declaratiion and initialization
        long longVal1 = -9000, longVal2=9000;
        float floatValue= 90.90f; //the letter f is needed
        double doubleValue=100.897d; //the letter d is optional
        char charValue ='c';//must use single quote
        boolean booleanValue=false;
        // illegal actions below
        // byte byteValue =100; we cannnot redeclare the variable 
        // byteValue = 200; instead use reassignment
        // boolean boolVal2 = 'false';
        // byte byteValue2 = 100000000; cannot exceed min and max

        // non primitive data type
        String stringValue="this is a string value";
        // using class
        String stringValue2=new String("this string is class");
        System.out.println(stringValue2);
        // object, for this we can use the same public class made
        Variable variableObject =new Variable();
        // use object from above to access instance variable
        System.out.println(variableObject.instanceVariable);
        // use class to use static variable
        System.out.println(Variable.staticVariable);

        // Type casting
        int intValueType=100;
        double intValueConvertedToDouble = intValueType;
        // Automaticallly cast from low datatype to high datatyoe
         
        // Explicit Casting
        double doubleValueType =190.8109;
        int doubleValueConvertedTOInt=(int) doubleValue;
        // Manually specify data type for eg. (int)
        // Note this type cast can only be done in primityive data type


        // Task
        // Make one double variable called doubleVar1=1000.12
        // Explicity cast the variable into float,floatVar1
        // Explicity cast the floatVar1 into int, intVar1
        // Make a string variable with "the integer is"
        // Print the string variable and print the int variable in another


        double doubleVar1=1000.12;
        float floatVar1=(float) doubleVar1;
        int intVar1=(int) floatVar1;
        System.out.println(floatVar1);
        System.out.println(intVar1);
        System.out.println("The integer is "+intVar1);



    }
}
