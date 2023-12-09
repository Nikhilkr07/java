//

public class Thread4 {
    public static void main(String[] args) {
        C c = new C();
        D d = new D();

        c.run();
        d.run();
    }
}

class C extends Thread{
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("C"+i);
        }
    }
}

class D extends Thread{
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("D"+i);
        }
    }
}