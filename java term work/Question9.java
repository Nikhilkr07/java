/*9.	WAP in an Applet Make two Button  one is Circle within Square  and second is Square within Circle. When user click on Circle within Square then draw Circle within Square. And when user click on Square within Circle then draw Square within Circle on the panel window? */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Question9 extends Applet implements ActionListener{
    int r, i =0;
    Button b1,b2;
    public void init(){
        r = 100;
        b1 = new Button("CWS");
        b2 = new Button("SWC");

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(b1);
        add(b2);
    }

    public void paint(Graphics g){
        if(i == 1){
            g.drawRect(100,100,r,r);
            // g.drawOval(100,100,r,r);
            g.drawOval(79,79,142,142);
        }
        else if(i == 2){
            g.drawRect(100,100,r,r);
            g.drawOval(100,100,r,r);
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("CWS")){
            i = 1;
        }
        else if(e.getActionCommand().equals("SWC")){
            i = 2;
        }
        repaint();
    }
}

//<applet code = "Question9" width = 500 height = 500>
// </applet>
