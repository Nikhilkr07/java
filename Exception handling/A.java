// Frist program of throw keyword

public class A{
    public static void main(String[] args) {
        B b = new B();
        b.salary(4);
       // b.salary(10);
    }
}

class B{
    void salary(int days){
        RuntimeException e = new RuntimeException("less than");

        if(days < 5){
            throw e;
        }
        else{
            System.out.println(5000*days);
        }
    }
}
