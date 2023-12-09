// Single inheritance in java
public class Parent extends Child{
    Parent(){
        System.out.println("This is Parent class");
    }
    public static void main(String[] args) {
        Parent p = new Parent();
    }
}

class Child{
    Child(){
        System.out.println("This is Child class");
    }
}