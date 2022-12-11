
package np.edu.bmc.classnobject.nestedinnerclass;
public class Inner {
    int innerVar = 10;
     class Outer{
        public void outerMethod(){
            System.out.println("hellow from the outer method");
        }
    }
    public void getInnerMethod(){
        Outer on = new Outer();
        on.outerMethod();
    }
    
}
class BahiraKoClass{
    public static void main(String[] args) {
        Inner in = new Inner();
        in.getInnerMethod();
    }
}
