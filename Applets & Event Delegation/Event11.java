// 2. MouseAdapter Program
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event11 extends Applet{
    int x = 0;
    int y = 0;
    public void init(){
        addMouseListener(new B());
    }    

    public void paint(Graphics g){
            g.setColor(Color.red);
            g.drawLine(100,100,100,200);
        }

    class B extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            e.getX();
            e.getY();

            repaint();
        }

    }
}

// <applet code = "Event11" width = 600 height = 600>
// </applet>
