
package np.edu.bmc.GUI;
import javax.swing.*;
import java.awt.*;

public class ToolBarDemo  extends JFrame{
    
    ToolBarDemo(){
        
        JButton jButton = new JButton("Save");
        JButton jButton1 = new JButton("Reset");
        //JLabel jLabel = new JLabel("Line");
        //JCheckBox jCheckBox = new JCheckBox("Fill");
        
        JToolBar jToolBar = new JToolBar("My ToolBar",1);
        
        jToolBar.add(jButton);
        jToolBar.add(jButton1);
       // jToolBar.add(jLabel);
       // jToolBar.add(jCheckBox);
        
        setLayout(new BorderLayout());
;
        add(jToolBar,BorderLayout.EAST);

        setTitle("ToolBar Demo");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(2);
        
    }
    public static void main(String[] args) {
        new ToolBarDemo();
    }
}
