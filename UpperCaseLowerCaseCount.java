
package uppercaselowercasecount;

public class UpperCaseLowerCaseCount {

    public static void main(String[] args) {
        
       String word="RaSeL";
       
       int Uppercase=0;
       int Lowercase=0;
       
       char[] ch= word.toCharArray();
       
       for( char chh : ch){
           if(chh>='A' && chh<='Z'){
               Uppercase++;
           } 
          else if(chh>='a' && chh<='z'){
               Lowercase++;
           }
       }
       
        System.out.println("Uppercase "+ Uppercase+ " Lowercase " + Lowercase);
}
}
