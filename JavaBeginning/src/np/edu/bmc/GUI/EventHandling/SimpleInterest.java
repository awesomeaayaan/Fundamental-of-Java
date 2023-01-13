
package np.edu.bmc.GUI.EventHandling;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
public class SimpleInterest extends JFrame{
    SimpleInterest(){
       
        JLabel jLabel5 = new JLabel("Find the Simple Interest: ");
         jLabel5.setBounds(100,20,170,20);
        JLabel jLabel2 = new JLabel("Principle: ");
            jLabel2.setBounds(100,40,170,20);
        JTextField jTextField = new JTextField(10);
         jTextField.setBounds(100,60,170,20);
        JLabel jLabel3 = new JLabel(" Time: ");
          jLabel3.setBounds(100,80,170,20);
        JTextField jTextField1 = new JTextField(10);
          jTextField1.setBounds(100,100,170,20);
        JLabel jLabel4 = new JLabel(" Rate: ");
           jLabel4.setBounds(100,120,170,20);
        JTextField jTextField2 = new JTextField(10);
            jTextField2.setBounds(100,140,170,20);
        JButton jButton = new JButton("Interest");
           jButton.setBounds(100,170,170,20);
            JLabel jLabel6 = new JLabel(" Result: ");
             jLabel6.setBounds(100,200,170,20);
              JTextField jTextField3 = new JTextField(10);
                jTextField3.setBounds(100,230,170,20);
                jTextField3.setEnabled(false);
        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String no1 = jTextField.getText();
               String no2 = jTextField1.getText();
               String no3 = jTextField2.getText();
               int result = (((Integer.valueOf(no1))*(Integer.valueOf(no2))*(Integer.parseInt(no3)))/100);
               jTextField3.setText(""+result);
            }
        });
        add(jLabel5);
          add(jLabel2);
        add(jTextField);
        add(jLabel3);
        add(jTextField1);
         add(jLabel4);
        add(jTextField2);
        add(jButton);
       
        add(jLabel6);
        add(jTextField3);
        setLayout(new GridLayout(3,3));
        //setLayout(null);
        setVisible(true);
        setSize(700,500);
        setTitle("SimpleInterest");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new SimpleInterest();
    }
    
}
