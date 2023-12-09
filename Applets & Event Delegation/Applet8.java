import java.applet.*;
import java.awt.*;

public class Applet8 extends Applet{
    Color c;
    public void init(){
        c = new Color(100,100,100); // r,g,b
        setBackground(c);
        // System.out.println(Color.c.getRed());
        setForeground(Color.red);

    }

    public void paint(Graphics g){
        g.fillOval(100,100,100,100);
    }
}

// <applet code="Applet8.class" width = 600 height = 500>
// </applet>
