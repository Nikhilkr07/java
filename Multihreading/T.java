// This is thread Simple example
class Mythread1 extends Thread{
    public void run(){
        while (true) {
            try{
                sleep(1000);
            }catch(Exception e){

            }
            System.out.println("Thread1 is Running");
            System.out.println("I am Happy");
        }
    }
}

class Mythread2 extends Thread{
    public void run(){
        while (true) {
            try{
                sleep(1000);
            }catch(Exception e){
                
            }
            System.out.println("Thread2 is Running");
            System.out.println("I am sad");
        }
    }
}

public class T {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();

        t1.start();
        t2.start();
    }
}
