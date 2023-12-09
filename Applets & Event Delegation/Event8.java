// from Event8 MouseListener and MouseAdapter programs are started.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event8 extends Applet{
    public void init(){
        Button b;
        TextField t;
        t = new TextField(222);
        t.addMouseListener(new C());
        add(t);
    }

    class C implements MouseListener{
    public void mouseClicked(MouseEvent m){
        setBackground(Color.red);
    }
    public void mousePressed(MouseEvent m){
        
    }
    public void mouseEntered(MouseEvent m){
        setBackground(Color.green);
    }
    public void mouseExited(MouseEvent m){
        
    }
    public void mouseReleased(MouseEvent m){
        
    }
}
}


// <applet code = "Event8" width = 500 height = 500>
// </applet>