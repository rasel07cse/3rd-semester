
package asiabank;

abstract class WorldBank{
    abstract void Interest();
}

class BankAsia extends WorldBank{
    void Interest(){
        System.out.println("BankAsia's interested 8%");
    }
}

class SonaliBank extends WorldBank{
    void Interest(){
        System.out.println("Sonali Bank's interested 9%");
    }
}

class PrimeBank extends WorldBank{
    void Interest(){
        System.out.println("Prime Bank's interested 10%");
    }
}

public class AsiaBank {

    public static void main(String[] args) {
        WorldBank ob1 = new BankAsia();
        ob1.Interest();
        
        WorldBank ob2 = new SonaliBank();
        ob2.Interest();
        
        WorldBank ob3 = new PrimeBank();
        ob3.Interest();
        
    }
    
}
