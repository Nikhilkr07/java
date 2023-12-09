import java.applet.*;
import java.awt.*;

public class Applet12 extends Applet
{
    Color c;
    public void init(){
        setForeground(Color.red);
    }    

    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawString("Nikhil",55,55);

        g.setColor(Color.red);
        g.fillOval(100,100,100,100);

        g.setColor(Color.green);
        g.fillOval(200,200,200,200);
    }
}

// <applet code="Applet12" width = 500 height = 500>
// </applet>