package week4;

public class ForLoop {
    public static void main(String[] args) {
        // USe for loops when condition is fixed
        for(int index=0;index<5;index++){
            System.out.println("Loop running "+ index);
        }

        // Decrement loop
        for(int index=10; index>=0; index--){
            System.out.println("Loop Running" + index);
        }

      
        // make a multiplication table of 2
        int a=2;
        for(int i=1;i<=10;i++){
            System.out.println(a+"x"+ i +"=" + a*i);
        }

        // nested loop
        for(int outer=0;outer<3;outer++){
            for(int inner=2; inner>=0;inner--){
                System.out.println("Inner"+ inner);
            }
            System.out.println("Outer" + outer);
        }
        
        // multiplication table from 1 to 10
        for(int num1=1;num1<=10;num1++){
            for(int num2=1;num2<=10;num2++){
                System.out.println(num1 + "x " + num2 + "=" + (num1*num2));
            }

        }
   }

    
}
