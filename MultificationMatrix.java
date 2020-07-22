
package multificationmatrix;
import java.util.Scanner;
public class MultificationMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int MatA[][]= new int[3][3];
        int MatB[][]= new int[3][3]; 
        int MatP[][]= new int[3][3];
        
        System.out.println("Enter the value of matrix A ");
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                MatA[row][col]= in.nextInt();
            }
        }
        
        System.out.println("Enter the value of matrix B ");
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                MatB[row][col]= in.nextInt();
            }
        }
        
       int sum=0;
       for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                for(int d=0;d<3;d++){
                    sum += MatA[row][d]*MatB[d][col];
            }
                MatP[row][col]= sum;
        }
       }
        
       
       System.out.println("Multification of two matrix ");
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                System.out.print(MatP[row][col]+"\t");
            }
            System.out.println();
        }      
        
    }
    
}
