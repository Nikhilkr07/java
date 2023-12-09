// two button action performed one perforemed to be red and another for green

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event3 extends Applet implements ActionListener {
    int i = 0;
    Button b1,b2;
    public void init(){
        b1 = new Button("red");
        b1.addActionListener(this);
        add(b1);
        b2 = new Button("green");
        b2.addActionListener(this);
        add(b2);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1)
        setBackground(Color.red);
        
        else if(e.getSource() == b2)
        setBackground(Color.green);
        System.out.println(i++);
    }
}

// <applet code = "Event3" width = 500 height = 500>
// </applet>