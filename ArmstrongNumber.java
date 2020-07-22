
package armstrongnumber;
import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
        
          int c=0,temp,a,n;
          
          System.out.println("Input a number to check if it is an Armstrong number"); 
            n = in.nextInt();
          
            temp=n;
            
          while(n>0){
             a=n%10;
             n=n/10;
             c=c+(a*a*a);
    }
    if(temp==c)
         System.out.println("Armstrong Number");  
    else
         System.out.println("Not Armstrong Number");  
}
}
