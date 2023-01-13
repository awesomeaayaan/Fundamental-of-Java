
package np.edu.bmc.FileHandling;
import java.io.*;
/**
 *
 * @author Aayaan
 */
public class DuplicateCharacter {
    public static void main(String[] args) throws IOException {
        File f = new File("test1.txt");
        FileInputStream fin = new FileInputStream(f);
        byte bytes[] = new byte[(int)f.length()];
        fin.read(bytes);
        System.out.println("Data READ!!");
        File OutFile = new File("test2");
        FileOutputStream fout = new FileOutputStream(OutFile);
        for(byte i:bytes){
            fout.write(i);
            fout.write(i);
        }
        fout.flush();
        System.out.println("Data Duplicated");
        
    }
}
