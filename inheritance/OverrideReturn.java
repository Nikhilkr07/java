// we can acheive method overriding by channging the return type for all knowledge about it goes to notbook page number 113


class Base1{
    Base1 show(){
        System.out.println("Base Show");
        return this;
    }
}

class Derived1 extends Base1{
    Derived1 show(){
        System.out.println("Derived show");
        return this;
    }
}


public class OverrideReturn {
    public static void main(String[] args) {
        Derived1 d = new Derived1();
        d.show();
    }
}
