/*8.	WAP to create a Form for registration of a user with the following validaitons?
i-Name should contain only character value.
ii-Address should contain Multiple values.
iii-In the subject field select maximum 2 checkbox out of three?
iv-In the Exam center field select maximum 2 list items.
 */

import java.awt.*;
import java.awt.event.*;

public class Question8 extends Frame {
    private TextField nameField;
    private TextArea addressArea;
    private Checkbox javaCheckbox, pythonCheckbox, cppCheckbox;
    private List examCenterList;

    public Question8() {
        // Set up the Frame
        setTitle("User Registration Form");
        setSize(400, 400);
        setLayout(null); // Set null layout
        /*addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });*/

        // Create components
        Label nameLabel = new Label("Name:");
        nameField = new TextField(20);

        Label addressLabel = new Label("Address:");
        addressArea = new TextArea(5, 20);

        Label subjectLabel = new Label("Subjects:");
        javaCheckbox = new Checkbox("Java");
        pythonCheckbox = new Checkbox("Python");
        cppCheckbox = new Checkbox("C++");

        Label examCenterLabel = new Label("Exam Center:");
        String[] examCenters = {"Center A", "Center B", "Center C", "Center D"};
        examCenterList = new List(4, true);
        for (String center : examCenters) {
            examCenterList.add(center);
        }

        Button submitButton = new Button("Submit");

        // Add action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform validations
                if (!isValidName(nameField.getText())) {
                    showMessage("Invalid Name. Please enter only characters.");
                    return;
                }

                // if (!isValidAddress(addressArea.getText())) {
                //     showMessage("Invalid Address. Please enter multiple values and only characters.");
                //     return;
                // }

                if (!isValidSubjects()) {
                    showMessage("Select at most 2 subjects.");
                    return;
                }

                if (!isValidExamCenters()) {
                    showMessage("Select at most 2 exam centers.");
                    return;
                }

                // If all validations pass, display a success message
                showMessage("Registration successful!");
            }
        });

        // Set bounds for each component
        int x = 50, y = 50, width = 300, height = 20;
        nameLabel.setBounds(x, y, width, height);
        nameField.setBounds(x, y + 30, width, height);

        addressLabel.setBounds(x, y + 70, width, height);
        addressArea.setBounds(x, y + 100, width, 100);

        subjectLabel.setBounds(x, y + 220, width, height);
        javaCheckbox.setBounds(x, y + 250, width, height);
        pythonCheckbox.setBounds(x, y + 280, width, height);
        cppCheckbox.setBounds(x, y + 310, width, height);

        examCenterLabel.setBounds(x, y + 340, width, height);
        examCenterList.setBounds(x, y + 370, width, 60);

        submitButton.setBounds(x, y + 450, 80, 30);

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(addressLabel);
        add(addressArea);
        add(subjectLabel);
        add(javaCheckbox);
        add(pythonCheckbox);
        add(cppCheckbox);
        add(examCenterLabel);
        add(examCenterList);
        add(submitButton);

        setVisible(true);
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z]+");
    }

    // private boolean isValidAddress(String address) {
    //     // Check if the address contains at least one letter and allows letters, digits, and certain special characters
    //     return address.matches(".*[a-zA-Z].*") && address.matches("[a-zA-Z0-9\\s\\\\\\-=]+");
    // }

    private boolean isValidSubjects() {
        int selectedCount = 0;
        if (javaCheckbox.getState()) selectedCount++;
        if (pythonCheckbox.getState()) selectedCount++;
        if (cppCheckbox.getState()) selectedCount++;

        return selectedCount <= 2;
    }

    private boolean isValidExamCenters() {
        int selectedCount = examCenterList.getSelectedItems().length;
        return selectedCount <= 2;
    }

    private void showMessage(String message) {
        Dialog dialog = new Dialog(this, "Message", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog.add(okButton);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new Question8();
    }
}
