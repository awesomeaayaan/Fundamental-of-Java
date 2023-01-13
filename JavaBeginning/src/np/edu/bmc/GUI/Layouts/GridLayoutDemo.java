
package np.edu.bmc.GUI.Layouts;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GridLayoutDemo extends JFrame {
   private JLabel principalLabel, rateLabel, timeLabel, resultLabel;
  private JTextField principalField, rateField, timeField, resultField;
  private JButton calcButton;
  private GridBagLayout layout;
  private GridBagConstraints constraints;
    public GridLayoutDemo(){
     // Set the title and layout of the window
    super("Simple Interest Calculator");
    layout = new GridBagLayout();
    setLayout(layout);
    constraints = new GridBagConstraints();

    // Create the labels and text fields
    principalLabel = new JLabel("Principal: ");
    principalField = new JTextField(10);
    rateLabel = new JLabel("Rate: ");
    rateField = new JTextField(10);
    timeLabel = new JLabel("Time (in years): ");
    timeField = new JTextField(10);
    resultLabel = new JLabel("Total Interest: ");
    resultField = new JTextField(10);
    resultField.setEditable(false);

    // Create the button and add an action listener
    calcButton = new JButton("Calculate");
    calcButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double principal, rate, time, result;
        principal = Double.parseDouble(principalField.getText());
        rate = Double.parseDouble(rateField.getText());
        time = Double.parseDouble(timeField.getText());
        result = (principal * rate * time)/100;
        resultField.setText(Double.toString(result));
      }
    });
    // Add the components to the window
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.insets = new Insets(10, 10, 5, 5);
    add(principalLabel, constraints);
    constraints.gridx = 1;
    add(principalField, constraints);
    constraints.gridx = 0;
    constraints.gridy = 1;
    add(rateLabel, constraints);
    constraints.gridx = 1;
    add(rateField, constraints);
    constraints.gridx = 0;
    constraints.gridy = 2;
    add(timeLabel, constraints);
    constraints.gridx = 1;
    add(timeField, constraints);
    constraints.gridx = 0;
    constraints.gridy = 3;
    add(resultLabel, constraints);
    constraints.gridx = 1;
    add(resultField, constraints);
    constraints.gridx = 0;
    constraints.gridy = 4;
    constraints.gridwidth = 2;
    add(calcButton, constraints);
    }
    public static void main(String[] args) {
      GridLayoutDemo SI =  new GridLayoutDemo();
        SI.setSize(400, 300);
        SI.setVisible(true);
        SI.setTitle("GridBagLayoutDemo");
    SI.setDefaultCloseOperation(2);
    }
}
