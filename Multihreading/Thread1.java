
import java.lang.Thread;

public class Thread1{
    static{
        Thread t = Thread.currentThread();
        System.out.println("Name of current thread in staitc block = "+ t.getName());
        System.out.println(t);
    }

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println("Name of current thread in main = "+ t.getName());
        System.out.println(t.getPriority());
        t.setName("Nikhil");
        t.setPriority(7);

        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}