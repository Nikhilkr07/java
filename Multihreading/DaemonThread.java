// Example of Daemon thread

class MyThread extends Thread{
    MyThread(String n){
        super(n);
    }
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName());
            try {
                sleep(1000);
            } catch (Exception e) {
              e.printStackTrace();
            }
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {

        MyThread m = new MyThread("child");
        m.setDaemon(true);
        m.start();

         for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
              e.printStackTrace();
            }
        }
    }
}
