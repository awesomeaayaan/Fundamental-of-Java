
package np.edu.bmc.GUI;

import javax.swing.*;


public class Addition {
    public static void main(String[] args) {
        
        //Obtain user input from JOptionPane input dialog
        String firstNumber= JOptionPane.showInputDialog("Enter first number");
        String secondNumber= JOptionPane.showInputDialog("Enter second number number");
        //convert String inputs to int value for use in calculation
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1+number2;
        
        //display result in JOptionPane message dialog
        JOptionPane.showMessageDialog(null,"The sum is"+sum,"Sum of two integers",JOptionPane.PLAIN_MESSAGE);
        
        
        
    }
    
}
