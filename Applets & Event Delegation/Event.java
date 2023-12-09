// First event aligation program
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event extends Applet{
    Button b;
    public void init(){
        b = new Button("add");
        b.addActionListener(new B());
        add(b);
    }    
}

class B implements ActionListener {
    int i = 0;
    public void actionPerformed(ActionEvent e){
        System.out.println(i++);
    }
}

// <applet code = "Event.class" width = 800 height = 800>
// </applet>
