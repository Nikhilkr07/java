//Example of Dynamic binding

class Base1{
    void show(){
        System.out.println("Show of Base");
    }

     public static void disp(Base1 b){
        b.show();
    }

}

class Child1 extends Base1{
    void show(){
        System.out.println("Show of child");
    }
}
public class Binding2 {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Child1 c = new Child1();
        Base1.disp(b);
        Base1.disp(c);
    }
}
