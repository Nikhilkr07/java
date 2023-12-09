import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet11 extends Applet{
    Button b1,b2;

    public void init(){
        b1 = new Button("circle");
        b1.setBounds(77,77,89,99);
        
        b2 = new Button("square");
        b2.setBounds(200,200,89,99);

        add(b1);
        add(b2);
        // setLayout(null);
        System.out.println(getLayout());

    }

    public void paint(Graphics g){
        g.fillRect(332,333, 88, 83);
    }
}
// <applet code = "Applet11.class" width = 800 height = 800>
// </applet>
