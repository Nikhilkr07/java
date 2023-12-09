// Action performed in button clicked

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event1 extends Applet{
    Button b;
    public void init(){
        b = new Button("add");
        b.addActionListener(new B(this));
        add(b);
    }
}

  class B implements ActionListener{ 
        int i = 0;
        Event1 x;
        B(Event1 a){
            x = a;
        }
        public void actionPerformed(ActionEvent e){
            x.setBackground(Color.red);
        }
    }

// <applet code = "Event1.class" width = 800 height = 800>
// </applet>