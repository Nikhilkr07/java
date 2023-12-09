// Same program as previous but different logic
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event2 extends Applet implements ActionListener{
    Button b;
    public void init(){
        b = new Button("add");
        b.addActionListener(this);
        add(b);
    }
    public void actionPerformed(ActionEvent e){
        setBackground(Color.red);
    }
}

// <applet code = "Event2" width = 500 height = 500>
// </applet>