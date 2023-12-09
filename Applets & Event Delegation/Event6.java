// program to get text from text field and change the text value of user string value of that value

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event6 extends Applet implements ActionListener {
    Button b1,b2;
    TextField t;
    String s = "Nikhil";

    public void init(){
        b1 = new Button("circle");
        b1.addActionListener(this);
        add(b1);
        t = new TextField("nikhil",22);
        add(t);
    }

    public void actionPerformed(ActionEvent e){
        s = t.getText();
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(s, 44, 44);
    }
}

// <applet code = "Event6" width = 500 height = 500>
// </applet>