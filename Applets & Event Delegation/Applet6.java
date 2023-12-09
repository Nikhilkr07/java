// Draw Oval(circle) in pannel window using applet

import java.applet.*;
import java.awt.*;

public class Applet6 extends Applet {
    public void paint(Graphics g){
        g.drawOval(100,100,200,200); // x,y,width,height 
    }
    
}

// <applet code="Applet6.class" width = 500 height = 500>
// </applet>

