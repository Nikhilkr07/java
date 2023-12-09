// Daemon Thread
class L extends Thread{
    int i = 0;
    public void run(){
    while (true) {
        try{
            sleep(500);
        }catch(Exception e){

        }
        System.out.println(i++);
    }
    }
}

public class Thread10 {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            System.out.println("Thread10 "+i);
        }

        System.out.println("Main exit");
        L l = new L();    
        l.setDaemon(true);
        l.start();
    }    
}
