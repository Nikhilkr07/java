// Add color on button

import java.applet.*;
import java.awt.*;

public class Applet10 extends Applet{
    Button b;
    public void init(){
        b = new Button("name");
        b.setBackground(Color.green);
        add(b);
    }
}

//<applet code="Applet10.class" width = 800 height = 800>
//</applet>