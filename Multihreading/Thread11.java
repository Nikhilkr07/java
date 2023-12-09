
class L extends Thread{
    int i = 0;
    public void run(){
    while (true) {
        try{
            
        }catch(Exception e){

        }
        System.out.println(i++);
    }
    }
}

public class Thread11 {
    public static void main(String[] args)throws Exception {
        L l = new L();   
        for(int i = 0; i<5; i++){
            B.sleep(500);
            System.out.println("Thread10 "+i);
        }
       
        l.start();
    }    
}

