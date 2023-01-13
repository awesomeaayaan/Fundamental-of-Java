
package np.edu.bmc.GUI.Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FlowLayoutDemo  extends JFrame {
    public FlowLayoutDemo(){
        JLabel jlabel1 = new JLabel("Principal:");
        JTextField jTextField = new JTextField(10);
        JLabel jlabel2 = new JLabel("Time:");
        JTextField jTextField1 = new JTextField(10);
        JLabel jlabel3 = new JLabel("Rate:");
        JTextField jTextField2 = new JTextField(10);
        JButton jButton = new JButton("check Interest");
        JLabel jlabel4 = new JLabel("Result");
        JTextField jTextField3 = new JTextField(10);
        add(jlabel1);
        add(jTextField);
          add(jlabel2);
        add(jTextField1);
       add(jlabel3);
        add(jTextField2);
        add(jButton);
         add(jlabel4);
        add(jTextField3);
       setLayout(new FlowLayout(FlowLayout.LEFT));
        //compulsory for all
        setVisible(true);
        setTitle("FlowLayout");
        setSize(600,600);
        setDefaultCloseOperation(2);
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
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
