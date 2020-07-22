
package bangladesgbank;

abstract class BangladeshBank{
    abstract void Interest();
}

 class PubaliBank extends BangladeshBank{
     @Override
 void Interest(){
     System.out.println("Pubali Bank interest 8% ");
 }
}

class RupaliBank extends BangladeshBank{
    @Override
 void Interest(){
     System.out.println("Rupali Bank interest 9% ");
 }
}

class SonaliBank extends BangladeshBank{
    @Override
 void Interest(){
     System.out.println("Sonali Bank interest 10% ");
 }
}


public class BangladesgBank {

    public static void main(String[] args) {
        BangladeshBank ob1 = new PubaliBank();
        ob1.Interest();
        
        BangladeshBank ob2 = new RupaliBank();
        ob2.Interest();
        
        BangladeshBank ob3 = new SonaliBank();
        ob3.Interest();
    }
    
}
