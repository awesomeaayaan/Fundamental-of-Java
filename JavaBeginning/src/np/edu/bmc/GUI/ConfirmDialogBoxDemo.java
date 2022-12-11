
package np.edu.bmc.GUI;

import javax.swing.*;

public class ConfirmDialogBoxDemo {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you really want to exit??");
        System.out.println(choice);
    }
    
    
}
