package week4;

import week2.task;

public class JumpStatement {
    public static void main(String[] args) {
        // break and continue statement in java
        // break will terminate the loop
        for(int index=0;index<5;index++){
            if (index==3) {
                break;//this will end the loop scope
                
            }
            System.out.println("Index " + index);
        }

        // can be used in any loop
        int count=0;
        while (count<=10) {
            if (count==1) {
                break;
                
            }
            System.out.println("Count "+ count);
            count++;
            
        }

        // task 
        // WAP to run for loop from _5 to 5
        // break the loop if the index is positive

        for(int i=-5;i<=5;i++){
            if (i>0) {
                break;
                
            }
            System.out.println(i);
        }


        // task 2
        // loop from 1 -20 using any loop
        // only print the value if it is even 
        // use continue to do this

        for(int a=1;a<=20;a++){
            if (a%2!=0) {
                continue;
                
            }
            System.out.println(a);
        }

            int b=1;
            while (b<=20) {
                if (b%2!=0) {
                    b++;
                    continue;
                   
                    
                }
                System.out.println(b);
                b++;
                
           
        }
    }
    
}
