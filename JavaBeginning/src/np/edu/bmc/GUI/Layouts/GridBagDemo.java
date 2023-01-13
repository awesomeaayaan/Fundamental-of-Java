
package np.edu.bmc.GUI.Layouts;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;
public class GridBagDemo  extends JFrame{
    JButton b1,b2,b3,b4,b5;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    GridBagConstraints gbc;
    GridBagDemo(){
        setSize(500,400);
        setTitle("GridLayout Demo");
     
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        l1 = new JLabel("Principal:");
        t1 = new JTextField(10);
        
        gbc.ipadx =0;
        gbc.ipady =0;
        gbc.weightx=0.5;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth=1;
        gbc.insets = new Insets(5,5,5,5);
        gbc.gridx=0;
        gbc.gridy=0;
        
        add(l1,gbc);
        add(t1);
        
        b2 = new JButton("Button 2");
        gbc.gridx = 1;
        add(b2,gbc);
        
        
        b3 = new JButton("Button 2");
        gbc.gridx = 2;
        add(b3,gbc);
        
         b4 = new JButton("This is a long button 4");
         gbc.ipady = 40;
             gbc.gridwidth=3;
       gbc.gridx=0;
        gbc.gridy=1;
        add(b4,gbc);
        
          b5 = new JButton("Button5");
            gbc.gridx=0;
        gbc.gridy=2;
         gbc.ipady = 20;
             gbc.gridwidth=2;
     
        add(b5,gbc);
        
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridBagDemo();
    }
    
}
