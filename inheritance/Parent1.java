// Multilevel inheritance

public class Parent1 extends Child2{
    Parent1(){
        System.out.println("This is parent class");
    }
    public static void main(String[] args) {
        //Child1 c1 = new Child1();
        Parent1 p1 = new Parent1();
    }
}

class Child1 extends Child3{ // class Child3 child hai Child1 ka (Child1 parent hai Child3 ka)
    Child1(){
        System.out.println("This is first child class");
    }
}

class Child2{
    Child2(){
        System.out.println("This is second child class");
    }
}

class Child3{
    Child3(){
        System.out.println("This is third child class");
    }
}
