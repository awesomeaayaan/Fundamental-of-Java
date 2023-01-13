
package np.edu.bmc.GUI.EventHandling;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class ActionEfficientDemo extends JFrame  {
    ActionEfficientDemo(){
         JButton jButton = new JButton("Click me");
        JButton jButton1 = new JButton("Click me if you want me");
        
        jButton.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.out.println("Button was clicked");
             }
        
        });
            jButton1.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.out.println("Good Luck");
             }
        
        });
       // jButton1.addActionListener(this);
        
        setLayout(new FlowLayout());
        
        add(jButton);
        add(jButton1);
        
        
        setTitle("Event Handling Action Demo");
        setVisible(true);
        setSize(1000,500);
        setDefaultCloseOperation(2);
        
    }
    public static void main(String[] args) {
        new ActionEfficientDemo();
    }
    }

