
package np.edu.bmc.GUI.EventHandling.lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Addition extends JFrame implements ActionListener {
 JTextField t1,t2,t3;
JLabel l1,l2,l3;
JButton b1,b2;


   public  Addition(){
       //super("Handling Action event");
       
        setVisible(true);
        setTitle("Addition Operation");
        setSize(500,500);
        setDefaultCloseOperation(2);
        
        JPanel jpanel = new JPanel();
        
        
        l1= new JLabel("Num1:");
        l2= new JLabel("Num2:");
        l3 = new JLabel("Result:");
        
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEnabled(false);
        
        b1= new JButton("Add");
        b2= new JButton("Multiply");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       int x,y,z;
       x = Integer.parseInt(t1.getText());
       y = Integer.parseInt(t2.getText());
       
       if (ae.getActionCommand()=="Add")
           z = x+y;
       else
           z = x*y;
       t3.setText(String.valueOf(z));
    }
   
    public static void main(String[] args) {
        new Addition();
    }
}
