// up and down casting in java

class Parent{
    String name;
    void show(){
        System.out.println("Show of parent");
    }
}

class Child extends Parent{
    int id;
    void show(){
        System.out.println("Show of child");
    }
}

public class UpAndDownCastiing {
    public static void main(String[] args) {
        // upcasting
        Parent p = new Child();
        p.name = "Nikhil";
        p.show();
        System.out.println(p.name);

        // Downcasting
        Child c = (Child)p;
        c.id = 30;
        c.show();
        System.out.println(c.name);
        System.out.println(c.id);
    }
}
