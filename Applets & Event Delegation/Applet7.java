// Fill colors on various objects

import java.applet.*;
import java.awt.*;

public class Applet7 extends Applet{
    public void init(){
        setBackground(Color.green);
        setForeground(Color.red);
    }

    public void paint(Graphics g){
        g.fillOval(100,100, 100,100);
    }
}

// <applet code = "Applet7.class" width = 600 height = 500>
// </applet>
