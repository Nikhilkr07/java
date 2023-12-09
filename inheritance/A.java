// Multilevel inheritance

public class A extends B{
    A(){
        System.out.println("This is class A");
    }
    public static void main(String[] args) {
        D d = new D();
    }
}

class B{
    B(){
        System.out.println("This is class B");
    }
}

class C extends B{
    C(){
        System.out.println("This is class C");
    }
}

class D extends C{
    D(){
        System.out.println("This is class D");
    }
}

