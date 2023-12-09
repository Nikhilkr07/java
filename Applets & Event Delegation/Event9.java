// from Event8 MouseListener and MouseAdapter programs are started.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event9 extends Applet{
    public void init(){
       addMouseListener(new D());
        
    }

    class D implements MouseListener{
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


// <applet code = "Event9" width = 500 height = 500>
// </applet>
