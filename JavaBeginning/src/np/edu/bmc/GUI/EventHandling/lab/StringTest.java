
package np.edu.bmc.GUI.EventHandling.lab;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class StringTest extends JFrame {
   public  StringTest(){
       JLabel jLabel = new JLabel("Input a String:");
        jLabel.setBounds(100,20,170,20);
       JTextField jTextField = new JTextField(20);
       jTextField.setBounds(100,50,170,20);
        JButton jButton = new JButton("check pallindrome");
        jButton.setBounds(100,80,170,20);
          JButton jButton1 = new JButton("check Reverse");
        jButton1.setBounds(100,110,170,20);
            JButton jButton2 = new JButton("Find Vowel");
        jButton2.setBounds(100,140,170,20);
        JTextField jTextField1 = new JTextField(40);
       jTextField1.setBounds(100,170,170,20);
          jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String a,b="";
       a = jTextField.getText();
       int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
             jTextField1.setText(String.valueOf(a+" palindrome."));
        }
        else
        {
              jTextField1.setText(String.valueOf(a+" not palindrome."));
        }
            }
        });
            jButton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String x,nstr=""; char ch;
       x = jTextField.getText();
        for (int i=0; i<x.length(); i++)
      {
        ch= x.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
         jTextField1.setText(String.valueOf(nstr));
            }
        });
              jButton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String word;
       word = jTextField.getText();
       char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        int length = word.length();
        char[] extractedVowel= new char[length];
             String showVowel="";
             for (int i =0; i<=length-1; i++ )
             {
                 for (int j = 0; j<=vowel.length-1; j++)
                 {
                     if(word.charAt(i)== vowel[j])
                     {
                         extractedVowel[i] = word.charAt(i);
                         showVowel = showVowel + String.valueOf(extractedVowel[i]);                     }
                 }
             }
            jTextField1.setText("Vowels: "+showVowel);
            }
        });
       add(jLabel);
       add(jTextField);
       add(jButton);
       add(jButton1);
       add(jButton2);
       add(jTextField1);
       //compalsory
         setLayout(new FlowLayout());
        setLayout(null);
        setVisible(true);
        setSize(600,500);
        setTitle("String Test");
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new StringTest();
    }
}
