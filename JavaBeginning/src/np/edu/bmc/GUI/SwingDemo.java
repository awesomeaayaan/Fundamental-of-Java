
package np.edu.bmc.GUI;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class SwingDemo extends JFrame {
    SwingDemo(){
        
        JMenuBar jmenubar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenu viewMenu = new JMenu("View");
        JMenu SaveAsMenu = new JMenu("Save as");
        
        JMenuItem openItem = new JMenuItem("open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem pdfItem = new JMenuItem("pdf");
        JMenuItem pngItem = new JMenuItem("png");
        
        SaveAsMenu.add(pdfItem);
        SaveAsMenu.add(pngItem);
        
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(SaveAsMenu);
        
        jmenubar.add(fileMenu);
        jmenubar.add(viewMenu);
        
        //adding mnemonics and accelerators
       // fileMenu.setMnemonic(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
       fileMenu.setMnemonic('f');
       SaveAsMenu.setMnemonic('s');
       openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
        
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.RED);
        
        setLayout(new FlowLayout());
        add(jmenubar);
        add(jPanel);
        
        
       
        
        setTitle("my second app");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
    public static void main(String[] args) {
        new SwingDemo();
    }
}
