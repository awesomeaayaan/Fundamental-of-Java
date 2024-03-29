
package np.edu.bmc.GUI.Layouts;

import javax.swing.*;
import java.awt.*;


public class GroupLayoutDemo extends JFrame {
    GroupLayoutDemo(){
       JButton jButton1 = new JButton("1");
       JButton jButton2 = new JButton("2");
       JButton jButton3 = new JButton("3");
       JButton jButton4 = new JButton("4");
       GroupLayout groupLayout = new GroupLayout(getContentPane());
     
       getContentPane().setLayout(groupLayout);
       
       groupLayout.setHorizontalGroup(
       
               groupLayout.createSequentialGroup().addComponent(jButton1).addComponent(jButton2)
               .addGroup(groupLayout.createParallelGroup().addComponent(jButton3).addComponent(jButton4))
       
       );
       groupLayout.setVerticalGroup(
       groupLayout.createSequentialGroup().addComponent(jButton1).addComponent(jButton2)
               .addGroup(groupLayout.createParallelGroup().addComponent(jButton3).addComponent(jButton4))
       );
        
        setVisible(true);
        setTitle("GroupLayout");
        setSize(500,500);
        setDefaultCloseOperation(2);
    }
    
    public static void main(String[] args) {
        new GroupLayoutDemo();
    }
    
}
