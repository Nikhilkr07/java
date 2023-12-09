// Action listener programs
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event4 extends Applet implements ActionListener{
    Button b1;
    TextField t1,t2;
    public void init(){
        t1 = new TextField(11);
        t2 = new TextField(11);
        b1 =  new Button("red");

        b1.addActionListener(this);
        add(b1);
        add(t1);
        add(t2);
    }

    public void actionPerformed(ActionEvent e){
        t2.setText(t1.getText().toUpperCase());
    }
}

// <applet code="Event4" width = 500 height = 500>
// </applet>
