// Set the name of thread

public class Thread6 {
    public static void main(String[] args) {
        G g = new G();
        System.out.println(g);
    }    
}

class G extends Thread{
    G(){
        //setName("nikhil");
        super("nikhil");
    }
}
