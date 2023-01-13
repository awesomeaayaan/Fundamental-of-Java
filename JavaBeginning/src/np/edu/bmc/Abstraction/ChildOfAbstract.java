
package np.edu.bmc.Abstraction;
public   class ChildOfAbstract  extends AbstractClass{
    
    @Override
    public void method2(){
        System.out.println("This is the method 2 declaration from the another class");
    }
    public static void main(String[] args) {
        ChildOfAbstract coa = new ChildOfAbstract();
        coa.method1();
        coa.method2();
        
    }
    
}
