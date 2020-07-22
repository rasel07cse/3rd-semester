
package methodoverridding;

class Room{
    float length;
    float breadth;
    
    Room(float x, float y){
        length=x;
        breadth=y;
    }
    Room(float x){
        length=breadth=x;
    }
    
    float area(){
        return length*breadth;
    }

}

public class MethodOverRidding {

    public static void main(String[] args) {
        
        
        Room room1=new Room (20,4);
        System.out.println("Area of room1 "+room1.area());
        
        Room room2=new Room(20);
         System.out.println("Area of room2 "+room2.area());
        
    }
    
}
