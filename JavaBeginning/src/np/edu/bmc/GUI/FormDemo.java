
package np.edu.bmc.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
public class FormDemo extends JFrame {
    JPanel p1,p2,p3,sp1,sp2;
    JLabel lblname,lblname1,lblsex,lblhobby,lblfaculty,lblremarks,lblsemester,lblage;
    JTextField txtname,jpass,jage;
    JRadioButton rbmale,rbfemale;
    ButtonGroup bg;
    JCheckBox chkplay,chkread,chkvisit,chkcode;
    JComboBox cmbfaculty,cmbsemester;
    JTextArea txtarea;
    JScrollPane sp;
    
    FormDemo(){
        setSize(600,500);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Form Demo");
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        sp1=new JPanel();
        sp2=new JPanel();
        p1.setPreferredSize(new Dimension(600,50));
        p2.setPreferredSize(new Dimension(50,500));
        
        //Adding three panel in the frame
        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.WEST);
        add(p3,BorderLayout.CENTER);
        p3.setLayout(new GridLayout());
        
        //adding toolbar in panel 1
         
        JButton jButton = new JButton("Save");
        JButton jButton1 = new JButton("Reset");
        JButton jButton2 = new JButton("Exit");
        JToolBar jToolBar = new JToolBar("My ToolBar",1);
        
        jToolBar.add(jButton);
        jToolBar.add(jButton1);
        jToolBar.add(jButton2);
        p2. add(jToolBar,BorderLayout.EAST);
        //Adding the action listener
          jButton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
           jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                rbmale.setActionCommand("Male");
                rbfemale.setActionCommand("Female");
        String First_name = txtname.getText();
        String Last_name = jpass.getText();
        String Age = jage.getText();
        String gender=bg.getSelection().getActionCommand();
        String value = cmbfaculty.getSelectedItem().toString();
        String value1 = cmbsemester.getSelectedItem().toString();
        String remark = txtarea.getText();
        try{
            FileWriter Writer = new FileWriter("aayaan.txt",true);
            Writer.write(" "+First_name+" "+Last_name+" "+Age+" "+gender+" "+value+" "+value1+" "+remark);
           // Writer.write(System.getProperty("Line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null,"Save successfully");
            setVisible(false);
            
        }catch( Exception ae){
             JOptionPane.showMessageDialog(null,"Error");
        }
            } 
        });
          
           jButton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txtname.setText(null);
                 jpass.setText(null);
                 jage.setText(null);
                chkread.setSelected(false);
                chkvisit.setSelected(false);
                chkcode.setSelected(false);
                chkplay.setSelected(false);
                
                cmbfaculty.setSelectedIndex(0);
                cmbsemester.setSelectedIndex(0);
                 txtarea.setText(null);
            }
        });
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
        lblname = new JLabel("First Name");
        txtname = new JTextField(20);
        lblname.setBounds(80,20,100,25);
        txtname.setBounds(20,20,200,25);
        sp1.add(lblname);
        sp2.add(txtname);
        //Creating and adding Label and text field
        lblname1 = new JLabel("LastName");
        jpass = new JTextField(20);
        lblname1.setBounds(80,50,100,25);
        jpass.setBounds(20,50,200,25);
        sp1.add(lblname1);
        sp2.add(jpass);
          //Creating and adding Label and text field
        lblage = new JLabel("Age");
        jage = new JTextField(20);
        lblage.setBounds(80,80,100,25);
        jage.setBounds(20,80,200,25);
        sp1.add(lblage);
        sp2.add(jage);
        //Creating and adding the radio button
        lblsex = new JLabel("Gender");
        rbmale = new JRadioButton("Male",true);
        rbfemale = new JRadioButton("Female",true);
        bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);
      
        lblsex.setBounds(80,110,100,25);
        rbmale.setBounds(20,110,75,25);
        rbfemale.setBounds(100,110,75,25);
        //rbothers.setBounds(120,80,75,25);
        sp1.add(lblsex);
        sp2.add(rbmale);
        sp2.add(rbfemale);
        //Creating and adding checkbox
        lblhobby = new JLabel("Hobbies");
        chkplay = new JCheckBox("Playing");
        chkread = new JCheckBox("Reading");
        chkvisit = new JCheckBox("Visiting");
        chkcode = new JCheckBox("Coding");
        lblhobby.setBounds(80,140,100,25);
        chkplay.setBounds(20,140,75,25);
        chkread.setBounds(100,140,75,25);
        chkvisit.setBounds(180,140,75,25);
        chkcode.setBounds(20,170,90,25);
        sp1.add(lblhobby);
        sp2.add(chkplay);
        sp2.add(chkread);
        sp2.add(chkvisit);
        sp2.add(chkcode);
        
        //Crating the Combobox and adding the element
        lblfaculty = new JLabel("Select Faculty:");
        cmbfaculty = new JComboBox();
        cmbfaculty.addItem("Science");
        cmbfaculty.addItem("Management");
        cmbfaculty.addItem("Humanities");
        cmbfaculty.addItem("LLB");
        cmbfaculty.addItem("Education");
        lblfaculty.setBounds(80,200,100,25);
        cmbfaculty.setBounds(20,200,100,25);
        cmbfaculty.setSelectedIndex(0);
        sp1.add(lblfaculty);
        sp2.add(cmbfaculty);
        
         lblsemester = new JLabel("Semester:");
        cmbsemester = new JComboBox();
        cmbsemester.addItem("first");
        cmbsemester.addItem("second");
        cmbsemester.addItem("Third");
        cmbsemester.addItem("fourth");
        cmbsemester.addItem("fifth");
        cmbsemester.addItem("sixth");
        cmbsemester.addItem("seventh");
        cmbsemester.addItem("eighth");
        lblsemester.setBounds(80,230,100,25);
        cmbsemester.setBounds(20,230,100,25);
        cmbsemester.setSelectedIndex(0);
        sp1.add(lblsemester);
        sp2.add(cmbsemester);
        
        //Creating and adding text area and scrol pane
        lblremarks = new JLabel("Remarks:");
        txtarea = new JTextArea(3,20);
        sp = new JScrollPane(txtarea);
        lblremarks.setBounds(80,260,100,25);
        sp.setBounds(20,260,200,75);
        sp1.add(lblremarks);
        sp2.add(sp);
        setVisible(true);
    }
    public static void main(String[] args) {
        FormDemo fram = new FormDemo();
    }
}
