// How may ways to access a non static variable and method in java; this is a very basic program but imp;

public class Base {
    int x = 10;

    Base(){  // third way
        show();
        System.out.println(x);
    }

    void m1(){
        show();
    }

    void show(){
        System.out.println("Show of base");
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Base().show();//first way
        System.out.println(new Base().x);// first way

        Base b = new Base();  
        b.show();  //second way
        System.out.println(b.x);//second way
    }
}

class Derived extends Base{
    
    Derived(){  // third way
        show();
        System.out.println(x);
    }

    
    void m2(){
        show();
    }


    public static void main(String[] args) {
        new Derived().show();//first way
        System.out.println(new Derived().x);// first way

        Derived b = new Derived();  
        b.show();  //second way
        System.out.println(b.x);//second way
    }
}
