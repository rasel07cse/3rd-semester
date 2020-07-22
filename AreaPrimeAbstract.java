
package areaprimeabstract;
import java.util.Scanner;

abstract class A{
  
     abstract void calculate();
      abstract void prime();
   
}
class S1 extends A{
    @Override
    void calculate(){
        float area,radious;
        area=3.1416*
    }

}

class S2 extends A{
    @Override
    void prime(){
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter an Integer to check prime number : ");
        num= in.nextInt();
        int count=0,i;
        for(i=2;i<num;i++){
        if(num%i==0){
        count++;
        break;
        }
    if(count==0)
                System.out.println("This is prime number");
    else
                System.out.println("this is not prime number");
        
        }
        
    }

}

public class AreaPrimeAbstract {

    public static void main(String[] args) {
        
    }
    
}
