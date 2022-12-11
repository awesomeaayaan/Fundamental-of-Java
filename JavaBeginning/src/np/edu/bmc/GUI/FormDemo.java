
package np.edu.bmc.GUI;
import javax.swing.*;
import java.awt.*;
public class FormDemo extends JFrame {
    JPanel p1,p2,p3,sp1,sp2;
    JLabel lblname,lblpass,lblsex,lblhobby,lblcountry,lblcomments;
    JTextField txtname;
    JPasswordField jpass;
    JRadioButton rbmale,rbfemale,rbothers;
    ButtonGroup bg;
    JCheckBox chkplay,chkread,chkvisit,chktkt;
    JComboBox cmbcountry;
    JTextArea txtarea;
    JScrollPane sp;
    JSlider sl;
    FormDemo(){
        setSize(600,400);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Form Demo");
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        sp1=new JPanel();
        sp2=new JPanel();
        p1.setPreferredSize(new Dimension(600,50));
        p2.setPreferredSize(new Dimension(50,400));
        
        //Adding three panel in the frame
        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.WEST);
        add(p3,BorderLayout.CENTER);
        p3.setLayout(new GridLayout());
        
        //Adding panels in Panel p3
        p3.add(sp1);
        p3.add(sp2);
        
        //Defining border of the panel
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        p2.setBorder(BorderFactory.createLineBorder(Color.black));
        p3.setBorder(BorderFactory.createLineBorder(Color.black));
        
        //No layout Manager
        sp1.setLayout(null);
        sp2.setLayout(null);
        
        //Setting backgroud color of panels
        sp1.setBackground(Color.ORANGE);
        sp2.setBackground(Color.ORANGE);
        
        //Creating and adding the Label and Text Field
        lblname = new JLabel("User Name");
        txtname = new JTextField(20);
        lblname.setBounds(80,20,100,25);
        txtname.setBounds(20,20,200,25);
        sp1.add(lblname);
        sp2.add(txtname);
        
        //Creating and adding password field
        lblpass = new JLabel("Password");
        jpass = new JPasswordField(20);
        lblpass.setBounds(80,50,100,25);
        jpass.setBounds(20,50,200,25);
        sp1.add(lblpass);
        sp2.add(jpass);
        
        //Creating and adding the radio button
        lblsex = new JLabel("Sex");
        rbmale = new JRadioButton("Male",true);
        rbfemale = new JRadioButton("Female",true);
       // rbothers = new JRadioButton("Others",true);
        bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
        //bg.add(rbothers);
        lblsex.setBounds(80,80,100,25);
        rbmale.setBounds(20,80,75,25);
        rbfemale.setBounds(100,80,75,25);
        //rbothers.setBounds(120,80,75,25);
        sp1.add(lblsex);
        sp2.add(rbmale);
        sp2.add(rbfemale);
        //sp2.add(rbothers);
        
        
        //Creating and adding checkbox
        lblhobby = new JLabel("Hobbies");
        chkplay = new JCheckBox("Playing");
        chkread = new JCheckBox("Reading");
        chkvisit = new JCheckBox("Visiting");
        chktkt = new JCheckBox("Coding");
        lblhobby.setBounds(80,110,100,25);
        chkplay.setBounds(20,110,75,25);
        chkread.setBounds(100,110,75,25);
        chkvisit.setBounds(180,110,75,25);
        chktkt.setBounds(20,140,90,25);
        sp1.add(lblhobby);
        sp2.add(chkplay);
        sp2.add(chkread);
        sp2.add(chkvisit);
        sp2.add(chktkt);
        
        //Crating the Combobox and adding the element
        
        
        
        
        
        
        setVisible(true);
                
                
        
        
    }
    public static void main(String[] args) {
        FormDemo fram = new FormDemo();
    }
    
}
