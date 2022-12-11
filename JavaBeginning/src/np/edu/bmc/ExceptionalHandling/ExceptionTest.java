
package np.edu.bmc.ExceptionalHandling;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("Ram");
        System.out.println("shyam");
        try{
        System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("divide by zero is a arithmetic exception");
        }
        System.out.println("Sita");
        System.out.println("Gita");
    }
}
