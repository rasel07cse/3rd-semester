

package javaexercise;
import java.util.Scanner;
public class JavaExercise {

    
    public static void main(String[] args) { 
          Scanner in = new Scanner(System.in);
            int number1,number2,number3;
	   float sum,average;
           System.out.print("Input the first number: ");
       number1=in.nextInt();
       System.out.print("Input the second number: ");
       number2=in.nextInt();
        System.out.print("Input the third number: ");
         number3=in.nextInt(); 
         sum=number1+number2+number3;
         average=sum/3;
         System.out.print("Average value is :"+average);
    }
    
}