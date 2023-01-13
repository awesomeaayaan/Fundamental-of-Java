
package np.edu.bmc.GUI.Layouts;

import javax.swing.*;//for swing component
import java.awt.*;//for Layout classes

public class CardLayoutDemo extends JFrame {
    public CardLayoutDemo(){
        
       JLabel jLabel = new JLabel("I am first Jlabel");
       JLabel jLabel1 = new JLabel("I am second Jlabel");
       
       
       jLabel.setBounds(10,10,70,40);
       jLabel.setBounds(10,30,90,40);
      
       add(jLabel);
       add(jLabel1);
        
        //compulsory for all
        setVisible(true);
        setTitle("CardLayoutDemo");
        setSize(600,600);
        setDefaultCloseOperation(2);
        
    }
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
    
}
