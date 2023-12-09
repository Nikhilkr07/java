import java.applet.*;
import java.awt.*;

public class Applet3 extends Applet{
    String s;
    public void init(){
        s = "abc";
    }

    public void paint(Graphics g){
        g.drawString(s,33,33);
    }
    
}
//<applet code= "Applet3.class" width=222 height=222>
// </applet>


