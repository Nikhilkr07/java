// Thread Synchronization

class J extends Thread{
    public void run(){
        Mul.table(5);
    }
}

class K extends Thread{
    public void run(){
        Mul.table(7);
    }
}

class Mul{
    synchronized static void table(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n*i);
        }
    }
}

public class Thread9 {
    public static void main(String[] args) {
        J j = new J();
        K k = new K();
        j.start();
        k.start();

    }
}
