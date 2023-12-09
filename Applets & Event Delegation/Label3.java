import java.applet.*;
import java.awt.*;

public class Label3 extends Applet{
    Button b;
    Label l;
    TextField t;
    public void init(){
        t = new TextField("Nikhil");
        b = new Button("Name");
        l = new Label("Enter a no");

        add(l);
        add(t);
        add(b);
    }
    
}
//<applet code= "Label3" width = 600 height = 600>
// </applet>