
package np.edu.bmc.Abstraction;


public class ChildOfIInterface implements InterfaceName {
    
    @Override
    public void method1(){
        System.out.println("redefined method 1");
    }
    @Override 
    public void method2(){
        System.out.println("Redefined method 2");
        
        
    }
    public static void main(String[] args) {
        ChildOfIInterface coi = new ChildOfIInterface();
        coi.method1();
        coi.method2();
    }
    
    
}
