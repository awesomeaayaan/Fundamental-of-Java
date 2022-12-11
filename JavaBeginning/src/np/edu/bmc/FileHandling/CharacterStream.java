
package np.edu.bmc.FileHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
       FileReader string1 = new FileReader("myfile.txt");
       
       
       
       FileWriter fw = new FileWriter("ball.txt" );
        int i=0;
        while((i=string1.read())!=-1){
            System.out.print((char) i);
           fw.write(i);
            
        }
        string1.close();
        fw.close();
        
    }
    
}
