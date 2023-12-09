// Lable in applet (how to check lable)
import java.applet.*;
import java.awt.*;

public class Label1 extends Applet{
    Button b;
    public void init(){
        b = new Button("Name");
        b.setBackground(Color.green);
        System.out.println(b.getLabel());
        add(b);
    }
}

//<applet code= "Label1" width = 600 height = 600>
// </applet>
