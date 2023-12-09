//The best example of method overriding is toSrting() method of object class

class Bike{
    void show(){
        System.out.println("Bike is running");
    }
}

class Ninja extends Bike{
    void show(){
        //Agar parent wale yani Bike class wale show ko bhi run karna hai to super ka use karenge
        //super.show();
        System.out.println("Ninja is running");
    }
      public String toString(){
        return "Jai Shree Ram";
    }
}
public class OverridingBestEg {
    public static void main(String[] args) {
        Ninja n = new Ninja();
        n.show();
        //Without overrind the mehod we have ouput is reference variable is hash code (Ninja@5305068a)
        // System.out.println(n);

        // We override the toString method then ouput is denpends on me
        System.out.println(n);

        // otput is Jai Shree Ram
        
    }
    
}
