import java.applet.*;
import java.awt.*;

public class Applet9 extends Applet {
    Button b;
    public void init(){

        for(int i = 0; i<37;i++){
            add(new Button("Name"+i));
        }
    }
}

// <applet code="Applet9.class" width = 600 height = 500>
// </applet>