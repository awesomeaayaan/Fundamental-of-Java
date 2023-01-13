
package np.edu.bmc.GUI.EventHandling;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class ActionDemo extends JFrame implements ActionListener {
    ActionDemo(){
        
        JButton jButton = new JButton("Click me");
        JButton jButton1 = new JButton("Click me if you want me");
        
        jButton.addActionListener(this);
        jButton1.addActionListener(this);
        
        setLayout(new FlowLayout());
        
        add(jButton);
        add(jButton1);
        
        
        setTitle("Event Handling Action Demo");
        setVisible(true);
        setSize(1000,500);
        setDefaultCloseOperation(2);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("You click the button");
    }
    public static void main(String[] args) {
        new ActionDemo();
    }
    
}
