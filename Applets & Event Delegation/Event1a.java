// Action performed in button clicked

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event1a extends Applet{
    Button b;
    public void init(){
        b = new Button("add");
        b.addActionListener(new B());
        add(b);
    }
    int i = 0;
  class B implements ActionListener{ 
        public void actionPerformed(ActionEvent e){
            setBackground(Color.red);
            System.out.println(i++);
        }
    }
}

// <applet code = "Event1a.class" width = 800 height = 800>
// </applet>
