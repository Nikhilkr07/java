/*12.	WAP to show the Working of multithreading . Make separate program by using Runnable  interface And by using Thread Class .also use their methods .  */
class A implements Runnable{
    public void run(){
          for(int i = 0; i<10; i++){
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Thread A"+i);
        }
    }
}

class B implements Runnable{
    public void run(){
          for(int i = 0; i<10; i++){
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Thread B"+i);
        }
    }
}

class C implements Runnable{
    public void run(){
          for(int i = 0; i<10; i++){
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Thread C"+i);
        }
    }
}


public class Question12 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Thread t = new Thread(a);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(c);
        t.start();
        t1.start();
        t2.start();
    }    
}
