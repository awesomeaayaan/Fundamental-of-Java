
package np.edu.bmc.ExceptionalHandling;

public class TrynFinally {
    public static void main(String[] args) {
       try{
           int divideByzero=5/0;
           System.out.println("Rest of the code in try block");
       }
       finally{
           System.out.println("this statement is always executed");
       }
    } 
}
