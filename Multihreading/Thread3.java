// 2. By implementing runnable interface (Association)


class A1 implements Runnable{
    public void run(){
        System.out.println("A Thread");
    }
}

class B1 implements Runnable{
    public void run(){
        System.out.println("B Thread");
    }
}


public class Thread3 {
    public static void main(String[] args) {
        A1 a = new A1();
        Thread t1 = new Thread(a);
        t1.start();
        B1 b = new B1();
        Thread t2 = new Thread(b);
        t2.start();
    }
}
