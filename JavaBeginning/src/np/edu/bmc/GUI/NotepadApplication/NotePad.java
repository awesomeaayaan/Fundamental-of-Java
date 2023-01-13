
package np.edu.bmc.GUI.NotepadApplication;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
public class NotePad {
    JTextArea textArea;
  JFrame frame;
  JMenuBar menuBar;
  JMenu fileMenu;
  JMenuItem openMenuItem;
  JMenuItem saveMenuItem;
  JMenuItem exitMenuItem;
  
  public NotePad() {
    textArea = new JTextArea();
    frame = new JFrame("Notepad");
    menuBar = new JMenuBar();
    fileMenu = new JMenu("File");
    openMenuItem = new JMenuItem("Open");
    saveMenuItem = new JMenuItem("Save");
    exitMenuItem = new JMenuItem("Exit");
  }
  
  public void createAndShowGUI() {
    // Set up the menu bar
    fileMenu.add(openMenuItem);
    fileMenu.add(saveMenuItem);
    fileMenu.add(exitMenuItem);
    menuBar.add(fileMenu);
    frame.setJMenuBar(menuBar);

    // Set up the text area
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    JScrollPane scrollPane = new JScrollPane(textArea);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

    // Set up the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    frame.setVisible(true);

    // Set up the event listeners
   // openMenuItem.addActionListener((e) -> openFile());
    //saveMenuItem.addActionListener((e) -> saveFile());
    //exitMenuItem.addActionListener((e) -> exitNotepad());
    /*
    public void openFile() {
    JFileChooser fileChooser = new JFileChooser();
    int returnVal = fileChooser.showOpenDialog(frame);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File file = fileChooser.getSelectedFile();
      try {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        textArea.setText("");
        while ((line = reader.readLine()) != null) {
          textArea.append(line + "\n");
        }
        reader.close();
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }
    public void saveFile() {
    JFileChooser fileChooser = new JFileChooser();
    int returnVal = fileChooser.showSaveDialog(frame);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File file = fileChooser.getSelectedFile();
      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(textArea.getText());
        writer.close();
      } catch (Exception ex) {
          System.out.println(ex);
                }*/
  }
    public static void main(String[] args) {
        new NotePad();
    }
    
}
