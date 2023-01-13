
package np.edu.bmc.GUI.EventHandling;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class KeyEvents extends JFrame {
    KeyEvents(){
        
        JTextField jTextField= new JTextField(20);
        
       jTextField.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key is typed");
         }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key is pressed");
          }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key is released");
           }
           
       });
        add(jTextField);
        setLayout(new FlowLayout());
        
        setVisible(true);
        setSize(1000,500);
        setTitle("KeyEventHandling event");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new KeyEvents();
    }
}
