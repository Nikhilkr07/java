// First frame class program 

import java.awt.*;
import java.awt.event.*;

public class A{
    public static void main(String[] args) {
        B b = new B();
    }
}

class B extends Frame{
    Button b;
    TextField t;

    B(){
        t = new TextField(22);
        setLayout(new FlowLayout());
        Frame f = new Frame("geu");
        b = new Button("add");
        b.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){System.out.println(t.getText());}});
        setVisible(true);
        setSize(1000,1000);
        add(b);
        add(t);
    }
}