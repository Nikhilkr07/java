//

class E extends Thread{
    public void start(){
        for(int i = 0; i<10; i++){
            try{
                sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("E"+i);
        }
    }
}

class F extends Thread{
    public void start(){
        for(int i = 0; i<10; i++){
            try{
                sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("F"+i);
        }
    }
}


public class Thread5 {
    public static void main(String[] args) {
        E e = new E();
        F f = new F();

        e.start();
        f.start();
    }
}