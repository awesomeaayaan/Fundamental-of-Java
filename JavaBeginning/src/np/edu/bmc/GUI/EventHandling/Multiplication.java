
package np.edu.bmc.GUI.EventHandling;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class Multiplication extends JFrame {
    Multiplication(){
         JLabel jLabel2 = new JLabel("Multiplication of : ");
        JTextField jTextField = new JTextField(20);
        JLabel jLabel3 = new JLabel(" and ");
        JTextField jTextField1 = new JTextField(20);
        
        JButton jButton = new JButton("Multiply");
        JLabel jLabel = new JLabel(" is   ");
        
        
        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String no1 = jTextField.getText();
               String no2 = jTextField1.getText();
               
               int result = Integer.valueOf(no1)*Integer.valueOf(no2);
               jLabel.setText(" is "+result);
            }
        });
          add(jLabel2);
        add(jTextField);
        add(jLabel3);
        add(jTextField1);
        add(jButton);
       
        add(jLabel);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(700,500);
        setTitle("Multiplication");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new Multiplication();
    }
    
}
