// Binding in java staic binding example

class Base{
    int x = 10;
    static int y = 100;

    Base(){
        System.out.println("Counstructor of base");
    }

    static void show(){
        System.out.println("Show of base");
    }

    void disp(){
        System.out.println("disp of base");
    }
}

class Child extends Base{
    int x = 10;
    static int y = 100;

    Child(){
        System.out.println("Counstructor of Child");
    }

    static void show(){
        System.out.println("Show of Child");
    }

    void disp(){
        System.out.println("disp of Child");
    }
}

class Binding{
    public static void main(String[] args) {
        Base b = new Child(); // upcasting
        System.out.println(b.x);
        System.out.println(b.y);
        b.show();
        b.disp();
    }
}