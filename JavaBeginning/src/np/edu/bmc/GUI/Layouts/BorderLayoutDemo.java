
package np.edu.bmc.GUI.Layouts;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    public BorderLayoutDemo(){
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton west = new JButton("West");
        JButton east = new JButton("East");
        JButton center = new JButton("Center");
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH,north);
        add(BorderLayout.SOUTH,south);
        add(BorderLayout.WEST,west);
        add(BorderLayout.EAST,east);
        add(BorderLayout.CENTER,center);
        //compulsory for all
        setVisible(true);
        setTitle("BorderLayout");
        setSize(500,400);
        setDefaultCloseOperation(2);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
