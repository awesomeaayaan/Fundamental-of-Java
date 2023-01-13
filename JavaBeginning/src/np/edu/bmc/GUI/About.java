
package np.edu.bmc.GUI;
import java.awt.Font;
import javax.swing.*;
public class About extends JFrame {
    About(){
        
        
        ImageIcon icon = new ImageIcon(getClass().getResource("spiral-notepad-emoji.png"));
        setIconImage(icon.getImage());
        setBounds(100,100,500,400);
        setTitle("About notepad application");
        setDefaultCloseOperation(2);
        setLayout(null);
        
        setVisible(true);
        
        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("spiral-notepad-emoji.png")));
       iconLabel.setBounds(100,50,80,80);
       add(iconLabel);
       
       JLabel textlbl = new JLabel("Welcome to notepad");
       textlbl.setBounds(100,50,400,350);
       textlbl.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
       add(textlbl);
    }
    public static void main(String[] args) {
        new About();
    }
}
