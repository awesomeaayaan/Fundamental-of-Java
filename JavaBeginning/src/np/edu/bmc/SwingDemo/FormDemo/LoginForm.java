
package np.edu.bmc.SwingDemo.FormDemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
public class LoginForm extends JFrame  {
    public LoginForm(){
        
        JLabel jlabel = new JLabel("Username:");
        jlabel.setBounds(100,20,170,20);
        JTextField jtextfield = new JTextField(20);
        jtextfield.setBounds(100,40,170,20);
        JLabel jlabel1 = new JLabel("Password:");
         jlabel1.setBounds(100,60,170,20);
        JPasswordField jtextfield1 = new JPasswordField(20);
          jtextfield1.setBounds(100,80,170,20);
         JButton jbutton = new JButton("Login");
         jbutton.setBounds(100,110,170,20);
         
         add(jlabel);
         add(jtextfield);
         add(jlabel1);
         add(jtextfield1);
         add(jbutton);
         
        setLayout(new FlowLayout());
        setLayout(null);
        setTitle("LoginForm");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(2);
          jbutton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
         if(e.getActionCommand()=="Login"){
             String username = jtextfield.getText();
             char [] password = jtextfield1.getPassword();
             char[] actualpassword ={'b','i','r','b','a','l'};
             if(username.equals("birbal")&&Arrays.equals(actualpassword,password)){
                 System.out.println("access granted");
             }
             else{
                 System.out.println("access denied");
             }
         }
            }
        });
    }
    public static void main(String[] args) {
        new LoginForm();
    }
}
