/*14.	WAP to implement a color menu which have four options red, Green, Blue and Exit. When we’ll Press red, green, blue color it will set that color as background color and on exit we need to exit from the window. */

import java.awt.*;
import java.awt.event.*;

public class Question14 extends Frame implements ActionListener {

    private Button redButton, greenButton, blueButton, exitButton;
    private Label colorLabel;

    public Question14() {
        setTitle("Color Menu");
        setLayout(new FlowLayout());

        redButton = new Button("Red");
        redButton.addActionListener(this);
        add(redButton);

        greenButton = new Button("Green");
        greenButton.addActionListener(this);
        add(greenButton);

        blueButton = new Button("Blue");
        blueButton.addActionListener(this);
        add(blueButton);

        exitButton = new Button("Exit");
        exitButton.addActionListener(this);
        add(exitButton);

        colorLabel = new Label("Current Color:");
        add(colorLabel);

        setSize(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            setBackground(Color.red);
            colorLabel.setText("Current Color: Red");
        } else if (e.getSource() == greenButton) {
            setBackground(Color.green);
            colorLabel.setText("Current Color: Green");
        } else if (e.getSource() == blueButton) {
            setBackground(Color.blue);
            colorLabel.setText("Current Color: Blue");
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Question14();
    }
}

//<applet code = "Question13" width = 500 height = 500>
//</applet>