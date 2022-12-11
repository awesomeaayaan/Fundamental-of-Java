
package np.edu.bmc.SwingDemo;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;


public class JavaSwing  extends JFrame{
    JavaSwing(){
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.red);
        
        JButton jButton = new JButton("Click me");
        JButton jButton1 = new JButton("Click me if you can");
        JLabel jLabel = new JLabel("I am a Label");
        JTextField txt = new JTextField("this is pretext",15);
        JPasswordField password = new JPasswordField(20);
        JCheckBox jCheckBox = new JCheckBox("I am a checkbox");
        
        String arr[]={"Bsccsit","BCA","BBA","BIT","BIM"};
        
        JComboBox jComboBox = new JComboBox(arr);
        JList jList = new JList(arr);
        
        JRadioButton jRadioButton = new JRadioButton("Male");
        JRadioButton jRadioButton1 = new JRadioButton("Female");
        JRadioButton jRadioButton2 = new JRadioButton("Others");
        
         JLabel jLabel1 = new JLabel("Text_Area:");
        JTextArea jTextArea = new JTextArea("this is a text area",5,5);
        
        String[] header={"Name","Roll No","Class"};
        
        String[][] tableContent = {
            {"Ram","4","7"},
            {"Shyam","1","7"},
            {"Aayaan","2","16"}
        };
        
        JTable jTable= new JTable(tableContent,header);
          
        
        JScrollPane jScrollpane = new JScrollPane(jTable);
        
     
        
           
        
        ButtonGroup buttonGroup = new ButtonGroup();
        
        
        //Tree
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("MenuBar");
        DefaultMutableTreeNode menuNode = new DefaultMutableTreeNode("Menu");
        DefaultMutableTreeNode menuItemNode = new DefaultMutableTreeNode("MenuItem");
        DefaultMutableTreeNode menu2Node = new DefaultMutableTreeNode("Menu2");
        DefaultMutableTreeNode menuItem2Node = new DefaultMutableTreeNode("MenuItem 2");
        
        menu2Node.add(menuItem2Node);
        
        menuNode.add(menu2Node);
        menuNode.add(menuItemNode);
        
        rootNode.add(menuNode);
        
        JTree jtree = new JTree(rootNode);
        
        jPanel.add(jtree);
        
        //slider 0-horizontal 1=vertical 
        JSlider jSlider = new JSlider(1,0,100,77);
        
        jPanel.add(jSlider);
        
        
           jPanel.add(jScrollpane);
        jPanel.add(jTable);
        //jScrollpane.add(jTextArea);
        jPanel.add(jComboBox);
        jPanel.add(jList);
        jPanel.add(jLabel1);
        
        jPanel.add(jTextArea);
        
        buttonGroup.add(jRadioButton);
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        
        jPanel.add(password);
        
        jPanel.add(txt);
        
        
        jPanel.add(jRadioButton);
         jPanel.add(jRadioButton1);
         jPanel.add(jRadioButton2);
        jPanel.add(jCheckBox);
        jPanel.add(jButton);
       jPanel.add(jButton1);
       jPanel.add(jLabel);
       //add(jButton);
       //add(jButton1);
        
        add(jPanel);
        
        setTitle("my first swing application");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JavaSwing();
    }
}
