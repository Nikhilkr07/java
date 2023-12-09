// Abstraction first program here example of Birds.


class Parrot extends Bird{
    void fly(){
        System.out.println("Parrot is flying");
    }

    void eat(){
        System.out.println("Parrot is eating");
    }
 }

 class Crow extends Bird{
    void fly(){
        System.out.println("Crow is flying");
    }

    void eat(){
        System.out.println("Crow is eating");
    }
 }

 class Pigeon extends Bird{
    void fly(){
        System.out.println("Pigeon is flying");
    }

    void eat(){
        System.out.println("Pigeon is eating");
    }
 }


 abstract class Bird{
    //abstract String color = "Black"; data mamber can not be abstract
    String color = "Black";
    abstract void fly();
    abstract void eat();
    void drink(){
        System.out.println("Bird is drinking ");
    }
}
class Abstract2{

    public static void main(String[] args) {
        // class Bird b = new Bird();  abstract class can not be instantiated so we can not create objcet of abstract class
        // Parrot p = new Parrot(); this is correct but aisha nahi karna chahiye hamesha instance banana chahiye parrent ka or memory dena chahiye child ka
        // Bird b = new Parrot();
        // Bird b = new Crow();
        Bird b = new Pigeon(); // This is called upcasting
        b.fly();
        b.eat();
        b.drink();
        System.out.println(b.color);
    }

 }