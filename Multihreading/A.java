// How to create multithreading program in java
// 1 by using inheritance

public class A extends Thread{
    public void run(){
        System.out.println("Hello thread");
        System.out.println(Thread.currentThread().getName());
    }    

    public static void main(String[] args) {
        A a1 = new A();
        a1.setName("A"); //Set thread class name
        a1.start();  
        A a2 = new A(); // This is multiple thread
        a2.setName("B");
        a2.start();
    }
}
