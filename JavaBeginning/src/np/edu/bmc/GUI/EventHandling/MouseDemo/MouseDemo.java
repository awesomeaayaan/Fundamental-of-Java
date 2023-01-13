
package np.edu.bmc.GUI.EventHandling.MouseDemo;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class MouseDemo extends JFrame {
    MouseDemo(){
        JButton jButton = new JButton("clik me");
        
        jButton.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse was clicked");
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse was pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse was released");
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse was entered");
             }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse was exited");
            }
            
        });
        add(jButton);
        
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(1000,500);
        setTitle("MouseHandling event");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new MouseDemo();
    }
}
