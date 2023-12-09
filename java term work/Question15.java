import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Question15 extends Applet implements KeyListener, MouseListener {
    private String eventInfo = "Press a key or click the mouse";

    public void init() {
        addKeyListener(this);
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(eventInfo, 20, 20);
    }

    public void keyTyped(KeyEvent e) {
        eventInfo = "Key Typed: " + e.getKeyChar();
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        // setBackground(Color.black);
    }

    public void keyReleased(KeyEvent e) {
        // Not used in this example
    }

    public void mouseClicked(MouseEvent e) {
        eventInfo = "Mouse Clicked: X = " + e.getX() + ", Y = " + e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        setBackground(Color.red);
    }

    public void mouseReleased(MouseEvent e) {
        // Not used in this example
    }

    public void mouseEntered(MouseEvent e) {
        setBackground(Color.green);
    }

    public void mouseExited(MouseEvent e) {
        // Not used in this example
    }
}

//<applet code = "Question15" width = 500 height = 500>
//</applet>