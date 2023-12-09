// Multithreading and multlitasking program


class A extends Thread{
    A(String n){
        super (n);
    }
    public void run(){
        for(int i = 1; i<= 10; i++){
            System.out.println("A "+2*i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class B extends Thread{
    B(String n){
        super (n);
    }
    public void run(){
         for(int i = 1; i<= 10; i++){
            System.out.println("B "+3*i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    }


public class Thread2 {
    public static void main(String[] args) {
        A a = new A("T1"); // Name of thread
        B b = new B("T2");
        a.start();
        b.start();
       // a.run();
       // b.run();
    }
}
