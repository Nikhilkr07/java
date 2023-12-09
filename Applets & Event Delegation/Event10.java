// Adapter class (MouseAdapter class)
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event10 extends Applet{
    public void init(){
    Button b = new Button();
    TextField t;
    t = new TextField(222);
    t.addMouseListener(new E());
    add(b);
    add(t);
    }

class E extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
        setBackground(Color.red);
    }

    /* The Advantage of MouseAdapter class over MouseListener Interface we have no not override all the methods in MouseListener interface we have must need to override all the methods but here is not neccessary to override all the mthods. */

    /*public void mousePressed(MouseEvent e){

    }

    public void mouseEntered(MouseEvent e){
        setBackground(Color.blue);
    }

    public void mouseExited(MouseEvent e){

    }

    public void mouseReleased(MouseEvent e){

    }*/

}
}

// <applet code = "Event10" width = 500 height = 500>
// </applet>
