
package np.edu.bmc.GUI.EventHandling;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class MouseAdapterDemo extends JFrame {
    MouseAdapterDemo(){
        JButton jButton = new JButton("click me");
        
        jButton.addMouseListener(new MouseAdapter(){
           @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse was clicked");
               
            }
        });
        
        setLayout(new FlowLayout());
        
        add(jButton);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
        
    }
    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
