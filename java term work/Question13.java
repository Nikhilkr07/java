/*13.	WAP using Applet to draw circle, line ,rectangle and fill them with a color given by the user. */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Question13 extends Applet implements ActionListener{
    TextField t1,t2,t3;
    Button b1;
    Color c;
    Label l;
    int r=0,g=0,b=0,i=0;
    
    public void init(){
        b1 = new Button("fill");
        t1 = new TextField("r",30);
        t2 = new TextField("g",30);
        t3 = new TextField("b",30);
        l = new Label("Enter R G B values");

        b1.addActionListener(this);
        add(l);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
    }

    public void paint(Graphics g){
        if(i == 0){
        // g.setColor(Color.);
        g.drawOval(200,100,100,100);
        // g.setColor(s);
        g.drawLine(100, 175, 50, 100);
        // g.setColor(s);
        g.drawRect(400,100,150,100);
        }
        else{
        g.setColor(c);
        g.fillOval(200,100,100,100);
        g.setColor(c);
        g.drawLine(100, 175, 50, 100);
        g.setColor(c);
        g.fillRect(400,100,150,100);
        }
        
    }

    public void actionPerformed(ActionEvent e){
        r = Integer.parseInt(t1.getText());
        g = Integer.parseInt(t2.getText());
        b = Integer.parseInt(t3.getText());
        c = new Color(r,g,b);
        i++;
        repaint();
    }

}

//<applet code = "Question13" width = 500 height = 500>
//</applet>

