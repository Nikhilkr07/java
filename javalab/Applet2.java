// Draw line between 2 points x,y cordinators we click in two points then draw lines between two points
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet2 extends Applet {
    int i = 0;
    int x=0,y=0,x1=0,y1=0;
    public void init(){
        addMouseListener(new C());
    }

    public void paint(Graphics g){
        g.drawLine(x,y,x1,y1);
    }

    class C extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            if(i == 0){
                x = e.getX();
                y = e.getY();
                i=1;
            }
            else if(i==1){
                x1 = e.getX();
                y1 = e.getY();
                i = 0;
                repaint();
            }

        }
    }
}

// <applet code="Applet2.class" width = 500 height = 500>
//</applet>
