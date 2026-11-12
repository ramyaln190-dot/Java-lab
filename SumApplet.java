import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="SumApplet.class" width="400" height="200">
</applet>
*/

public class SumApplet extends Applet implements ActionListener {

    TextField num1, num2;
    Label result;
    Button addButton;

    public void init() {

        setLayout(new FlowLayout());

        add(new Label("Enter first number:"));
        num1 = new TextField(10);
        add(num1);

        add(new Label("Enter second number:"));
        num2 = new TextField(10);
        add(num2);

        addButton = new Button("Calculate Sum");
        add(addButton);

        result = new Label("Sum: ");
        add(result);

        addButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            double a = Double.parseDouble(num1.getText().trim());
            double b = Double.parseDouble(num2.getText().trim());

            result.setText("Sum: " + (a + b));

        } catch (NumberFormatException ex) {
            result.setText("Please enter valid numbers.");
        }
    }
}
