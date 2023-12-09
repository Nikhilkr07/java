// Ananoymous thread

public class Thread8 {
    public static void main(String[] args) {
        Thread t = new Thread(){public void run(){
            for(int i = 0; i<10; i++){
                try{
                    sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("I"+i);
            }
        }
        };

        t.start();
    }    
}
