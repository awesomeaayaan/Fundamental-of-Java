
package np.edu.bmc.GUI;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class SwingDemo extends JFrame {
    SwingDemo(){
         
        JMenuBar jmenubar = new JMenuBar();
     //    setJMenuBar(jmenubar);
          
       // jmenubar.setBounds(0,0,20,30);
        
        JMenu fileMenu = new JMenu("File");
        JMenu EditMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu helpMenu = new JMenu("Help");
        
        
        
        JMenu SaveAsMenu = new JMenu("Save as");
        
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem newWindowItem = new JMenuItem("New Window");
        JMenuItem pagesetupItem = new JMenuItem("Page Setup");
        JMenuItem printItem = new JMenuItem("Print");
        JMenuItem openItem = new JMenuItem("open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Save");
        
        
         JMenuItem undoItem = new JMenuItem("Undo");
         JMenuItem cutItem = new JMenuItem("Cut");
         JMenuItem coopyItem = new JMenuItem("Copy");
         JMenuItem pasteItem = new JMenuItem("Paste");
         JMenuItem DeleteItem = new JMenuItem("Delete");
         JMenuItem selectItem = new JMenuItem("Select All");
         JMenuItem timedateItem = new JMenuItem("Select All");
         
         JMenuItem AboutItem = new JMenuItem("About");
         
         JTextArea textarea = new JTextArea(20,30);
         
         
         
        
        JMenuItem pdfItem = new JMenuItem("pdf");
        JMenuItem pngItem = new JMenuItem("png");
        
           
        
        SaveAsMenu.add(pdfItem);
        SaveAsMenu.add(pngItem);
        
        //saveItem.setEnabled(false);
        //pdfItem.setEnabled(false);
        
        fileMenu.add(newItem);
        fileMenu.add(newWindowItem);
        fileMenu.add(pagesetupItem);
        fileMenu.add(printItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(SaveAsMenu);
        fileMenu.add(exitItem);
        
        EditMenu.add(undoItem);
        EditMenu.add(cutItem);
        EditMenu.add(coopyItem);
        EditMenu.add(pasteItem);
        EditMenu.add(DeleteItem);
        EditMenu.add(selectItem);
        EditMenu.add(timedateItem);
        
        helpMenu.add(AboutItem);
        
        
        
       // jmenubar.add(Box.createHorizontalGlue());
        //jmenubar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        jmenubar.add(fileMenu);
        jmenubar.add(EditMenu);
        jmenubar.add(viewMenu);
        jmenubar.add(helpMenu);
        
         setJMenuBar(jmenubar);
          
          
        JScrollPane scrollpane = new JScrollPane(textarea);
        add(scrollpane);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //scrollpane.setVerticalScrollBar(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
     
        
        //adding mnemonics and accelerators
       // fileMenu.setMnemonic(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
       fileMenu.setMnemonic('f');
       SaveAsMenu.setMnemonic('s');
       openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
       saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
       newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
       printItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        
        JPanel jPanel = new JPanel();
        //jPanel.setBackground(Color.RED);
        
        setLayout(new FlowLayout());
        add(jmenubar);
        add(jPanel);
        setLayout(null);
        
        
       
        
        setTitle("Notepad");
     
        setVisible(true);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("spiral-notepad-emoji.png"));
        setIconImage(icon.getImage());
        setBounds(100,100,600,400);
       //setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
    public static void main(String[] args) {
        new SwingDemo();
    }
}
