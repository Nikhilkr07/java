
import java.applet.*;
import java.awt.*;

public class Label2 extends Applet{
    Button b;
    Label l;
    public void init(){
        b = new Button("Name");
        l = new Label("Enter a no");
        add(l);
        add(b);
    }
}

//<applet code= "Label2" width = 600 height = 600>
// </applet>

