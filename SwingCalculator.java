import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame implements ActionListener {

    private JTextField num1, num2, result;
    private JButton addButton;

    public SwingCalculator() {

        setTitle("Basic Calculator");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Enter first number:"));
        num1 = new JTextField();
        add(num1);

        add(new JLabel("Enter second number:"));
        num2 = new JTextField();
        add(num2);

        add(new JLabel("Sum:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        addButton = new JButton("Calculate Sum");
        addButton.addActionListener(this);
        add(addButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1.getText().trim());
            double b = Double.parseDouble(num2.getText().trim());

            result.setText(String.valueOf(a + b));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numbers.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingCalculator());
    }
}
