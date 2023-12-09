
// Child ka privilege higher ho sakta hai  (Default)

class Base2{
   void show(){ // agar parent wala method default hai to child wala mehod ya to public hoga ya protected hoga ya to default hoga.
    System.out.println("Base Show");
   }
}

class Child2 extends Base2{
    public void show(){ // ye public bhi ho sakta hai or protected bhi ho sata hai or default bhi ho sakta hai
        System.out.println("child show");
    }
    // protected void show(){
    //     System.out.println("child show");
    // }
    // void show(){
    //    System.out.println("Child show");
    // }
}


public class Higher1Specifier {
     public static void main(String[] args) {
        Child2 c = new Child2();
        c.show();
    }
}
