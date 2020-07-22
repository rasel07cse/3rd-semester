
package leapyear;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int year;
        
        System.out.print("Enter a Year: ");
        year = in.nextInt();
        
        if(year%4==0 || year%100==0 || year%400==0)
            System.out.println("This is a Leap Year.");
        
        else
            System.out.println("This is not a Leap Year.");
        
    }
    
}
