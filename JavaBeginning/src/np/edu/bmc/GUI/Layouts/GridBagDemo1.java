
package np.edu.bmc.GUI.Layouts;
import java.awt.Button;  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
  
import javax.swing.*;  
public class GridBagDemo1 extends JFrame {
    public static void main(String[] args) {
        new GridBagDemo1();
    }
    public GridBagDemo1(){
         GridBagLayout grid = new GridBagLayout();  
            GridBagConstraints gbc = new GridBagConstraints();  
            setLayout(grid);  
            setTitle("GridBag Layout Example");  
            GridBagLayout layout = new GridBagLayout();  
    this.setLayout(layout);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 0;  
    this.add(new JLabel("Principle:"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 0;  
    this.add(new JTextField(10), gbc);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.ipady = 20;  
    gbc.gridx = 0;  
    gbc.gridy = 1;  
    this.add(new JLabel("Rate:"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 1;  
    this.add(new JTextField(10), gbc);  
    gbc.gridx = 0;  
    gbc.gridy = 2;  
     this.add(new JLabel("Time"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 2;  
    this.add(new JTextField(10), gbc);  
    gbc.gridx = 0;  
    gbc.gridy = 2;  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridwidth = 3;  
    this.add(new Button("Button Five"), gbc);  
            setSize(400, 400);  
            setPreferredSize(getSize());  
            setVisible(true);  
            setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }
}
