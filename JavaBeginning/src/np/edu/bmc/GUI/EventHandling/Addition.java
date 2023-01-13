
package np.edu.bmc.GUI.EventHandling;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class Addition extends JFrame  {
    Addition(){
        JLabel jLabel2 = new JLabel("Num1 : ");
        jLabel2.setBounds(100,20,170,20);
        JTextField jTextField = new JTextField(20);
        jTextField.setBounds(100,40,170,20);
        
        JLabel jLabel3 = new JLabel(" Num2 : ");
        jLabel3.setBounds(100,60,170,20);
        JTextField jTextField1 = new JTextField(20);
          jTextField1.setBounds(100,80,170,20);
        
        JButton jButton = new JButton("Sum");
           jButton.setBounds(100,120,170,20);
            JButton jButton1 = new JButton("Multiply");
             jButton1.setBounds(100,150,170,20);
           
        JLabel jLabel = new JLabel("  ");
        JTextField jTextField2 = new JTextField(10);
        jTextField2.setBounds(100,180,170,20);
        jTextField2.setEnabled(false);
        
        
        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int x,y,z;
       x = Integer.parseInt(jTextField.getText());
       y = Integer.parseInt(jTextField1.getText());
             z = x+y;
         jTextField2.setText(String.valueOf(z));
            }
        });
        
          jButton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int x,y,z;
       x = Integer.parseInt(jTextField.getText());
       y = Integer.parseInt(jTextField1.getText());
             z = x*y;
         jTextField2.setText(String.valueOf(z));
            }
        });
      
        add(jLabel2);
        add(jTextField);
        add(jLabel3);
        add(jTextField1);
        add(jButton);
        add(jButton1);
       
        add(jLabel);
        add(jTextField2);
        setLayout(new FlowLayout());
        setLayout(null);
        setVisible(true);
        setSize(700,500);
        setTitle("Addition and multipication");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new Addition();
    }
}
