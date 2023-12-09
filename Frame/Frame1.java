// First frame class program 

import java.awt.*;
import java.awt.event.*;

public class Frame1{
    public static void main(String[] args) {
        C b = new C();
    }
}

class C extends Frame{
    Button b;
    TextField t;

    C(){
        super("nikhil");
        t = new TextField(22);
        setLayout(new FlowLayout());
        Frame f = new Frame("geu");
        b = new Button("add");
        b.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){new C();}});
        setVisible(true);
        setSize(1000,1000);
        add(b);
        add(t);
    }
}
