// Create pannel and add two buttons one circle and another is square and if we click in circle button draw circle and click on square draw square in window pannel
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event7 extends Applet{
    int i=0;
    public void init(){
    Button b1,b2;
    b1 = new Button("circle");
    b2 = new Button("square");

    b1.addActionListener(new B());
    b2.addActionListener(new B());

    add(b1);
    add(b2);

    }

     public void paint(Graphics g){
        if(i == 1){
            //g.setColor(Color.red);
            g.fillOval(100,100,100,100);
        }
        else if(i == 2){
            g.setColor(Color.green);
            g.fillRect(100,100,100,100);
        }
    }

    class B implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand().equals("circle")){
                i = 1;
            }
            else if(e.getActionCommand().equals("square")){
                i = 2;
            }
            repaint();
        }
    }
}

// <applet code="Event7.class" width = 500 height = 500>
//</applet>

