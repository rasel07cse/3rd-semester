
package fibonacci;
import java.util.Scanner;
public class Fibonacci {
    
    public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
        int n1=0,n2=1,n3,i,count;
        System.out.println("Enter the count number");
            count=in.nextInt();
        System.out.print(n1+" "+n2);
  
        for(i=2;i<count;++i){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
      
    }
    
}
