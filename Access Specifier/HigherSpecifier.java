// Child ka privilege higher ho sakta hai  (protected)

class Base1{
   protected void show(){ // agar parent wala method protected hai to child wala mehtod ya to public hoga ya protected.
    System.out.println("Base Show");
   }
}

class Child1 extends Base1{
    public void show(){ // ye public bhi ho sakta hai or protected bhi
        System.out.println("child show");
    }
    // protected void show(){
    //     System.out.println("child show");
    // }
}

public class HigherSpecifier {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.show();
    }
    
}
