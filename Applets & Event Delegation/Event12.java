// TextListener interface
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event12 extends Applet{
    TextField t1,t2;

    public void init(){
        t1 = new TextField(22);
        t1.addTextListener(new B());
        t2 = new TextField(22);
        add(t1);
        add(t2);
    }

    class B implements TextListener{
        public void textValueChanged(TextEvent e){
            t2.setText(t1.getText());
        }
    }
}

// <applet code= "Event12" width = 600 height = 600>
// </applet>
