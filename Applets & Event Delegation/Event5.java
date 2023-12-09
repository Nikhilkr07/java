// imp Question: write a program to create a pannel and get value from user in texfield area and find its corresponding factorial value.
// Action listener programs
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Event5 extends Applet implements ActionListener{
    Button b1;
    TextField t1,t2;
    public void init(){
        t1 = new TextField(11);
        t2 = new TextField(11);
        b1 =  new Button("Fact");

        b1.addActionListener(this);
        add(b1);
        add(t1);
        add(t2);
    }

    public void actionPerformed(ActionEvent e){
        int i = Integer.parseInt(t1.getText());
        t2.setText(Integer.toString(fact(i)));
    }

    int fact(int n){
        if(n == 0)
        return 1;

        else
        return (n*fact(n-1));
    }
}

// <applet code="Event5" width = 500 height = 500>
// </applet>

