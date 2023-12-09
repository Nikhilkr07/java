
import java.awt.*;
import java.applet.*;
public class Applet2 extends Applet{

    public void paint(Graphics g){
        g.drawString("Hello", 33, 33);
        g.setColor(Color.blue);
        g.fillOval(300, 200, 60, 60);
        g.drawLine(100,100,200,100);
    }
}
//<applet code= "Applet2.class" width=222 height=222>
// </applet>
