import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyUI {
    public static void main(String[] args) {

        // Create a frame
        JFrame frame = new JFrame("My UI");

        // Create a panel with vertical layout to hold all panels
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Title panel
        JPanel panel_title = new JPanel();
        panel_title.setLayout(new FlowLayout());
        JLabel titleLabel = new JLabel("Calculator");
        panel_title.add(titleLabel);

        // panel for textboxes
        JPanel panel_textboxes = new JPanel();
        panel_textboxes.setLayout(new GridLayout(2, 2));
        // text fields for numbers
        JTextField numField1 = new JTextField();
        JTextField numField2 = new JTextField();
        // add them to their panel

        panel_textboxes.add(numField1);

        panel_textboxes.add(numField2);

        // panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());  // creates flow layout
        // buttons
        JButton button1 = new JButton("Add");
        JButton button2 = new JButton("Subtract");
        JButton button3 = new JButton("Multiply");
        JButton button4 = new JButton("Divide");

        // panel for result
        JPanel panel_result = new JPanel();
        panel_result.setLayout(new FlowLayout());
        // result label
        JLabel resultLabel = new JLabel("Result: ");

        // Add elements to the panels
        panel_result.add(resultLabel);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        // Add panels to the mainPanel in the desired order
        mainPanel.add(panel_title);         // Title panel (topmost)
        mainPanel.add(panel_textboxes);     // Textboxes panel (below title)
        mainPanel.add(panel);               // Buttons panel (below textboxes)
        mainPanel.add(panel_result);        // Result panel (bottom)

        // Add the main panel to the frame
        frame.add(mainPanel, BorderLayout.CENTER);  // Main panel in the center

        // Set frame properties
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Add ActionListeners for each button
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());
                    double result = num1 + num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());
                    double result = num1 - num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());
                    double result = num1 * num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(numField1.getText());
                    double num2 = Double.parseDouble(numField2.getText());
                    if (num2 != 0) {
                        double result = num1 / num2;
                        resultLabel.setText("Result: " + result);
                    } else {
                        resultLabel.setText("Cannot divide by zero.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });
    }
}