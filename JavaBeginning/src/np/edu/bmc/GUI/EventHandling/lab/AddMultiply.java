
package np.edu.bmc.GUI.EventHandling.lab;
import javax.swing.*;
import java.awt.*;
public class AddMultiply extends JFrame {
    JPanel p1,p2,p3;
    JTextField txtnum1,txtnum2,txtresult;
    JLabel lblnum1,lblnum2,lblresult;
    
    AddMultiply(){
        
        setSize(600,500);
        setDefaultCloseOperation(2);
        setTitle("Addition and Multiplication");
        setVisible(true);
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        p1.setPreferredSize(new Dimension(600,50));
        p2.setPreferredSize(new Dimension(50,500));
        
        setLayout(new BorderLayout());
        
        
    }
    public static void main(String[] args) {
        new AddMultiply();
    }
    
}
