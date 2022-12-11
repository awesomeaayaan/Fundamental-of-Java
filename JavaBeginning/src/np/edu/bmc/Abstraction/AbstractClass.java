
package np.edu.bmc.Abstraction;
public abstract class AbstractClass {
    public void method1(){//declaration
        System.out.println("test");//definition
    }
    public  abstract void method2();//only declaration no definition
    //abstract class may or maynot contain abstract method but 
    // in case of abstract method there should be abstract class
    public static void main(String[] args) {
        System.out.println("hello aayaan");
        //AbstractClass abc = new AbstractClass(); //Abstract class never be instanciated
    }
    
}
