
package multithreading;

import static java.lang.Thread.sleep;

class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("i="+i);
            try{
                sleep(230);
            }
            catch(Exception e){
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int j=0;j<5;j++){
            System.out.println("j="+j);
            try{
                sleep(350);
            }
            catch(Exception e){
            }
        }
    }
}

class C extends Thread{
    public void run(){
        for(int k=0;k<5;k++){
            System.out.println("k="+k);
            try{
                sleep(500);
            }
            catch(Exception e){
            }
        }
    }
}


public class MultiThreading {

    public static void main(String[] args) {
        A ob1= new A();
        B ob2=new B();
        C ob3=new C();
        
        ob1.setPriority(Thread.MAX_PRIORITY);
        ob2.setPriority(Thread.NORM_PRIORITY);
        ob3.setPriority(Thread.MIN_PRIORITY);
        
        ob1.start();
        ob2.start();
        ob3.start();
        
    }
    
}
