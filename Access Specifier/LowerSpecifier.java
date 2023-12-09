// Private is lowes access privilege so agar parent wala method private hai to child wala method public protected default or private sab ho sakta hai

class Base3{
    private void show(){
        System.out.println("Base show");
    }
}

class Child3 extends Base3{
    //  void show(){
    //     System.out.println("Child show");
    // }
    // public void show(){
    //     System.out.println("Child show");
    // }
    protected void show(){
        System.out.println("Child show");
    }
}

public class LowerSpecifier {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.show(); 
    }
}
