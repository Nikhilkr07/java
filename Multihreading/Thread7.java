// Thread by using Runnable interface

class H implements Runnable{
    public void run(){
          for(int i = 0; i<10; i++){
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("H"+i);
        }
    }
}

public class Thread7 {
    public static void main(String[] args) {
        H h = new H();
        Thread t = new Thread(h);
        t.start();
    }
}
