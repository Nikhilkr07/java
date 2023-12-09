//
import java.awt.*;

public class Frame2 extends Frame{
    Frame2(){
        setVisible(true);
        setSize(400,400);
        setLocation(300,200);
        System.out.println(getLocation());
    }
    public static void main(String[] args) {
        Frame2 f = new Frame2();
    }
}
