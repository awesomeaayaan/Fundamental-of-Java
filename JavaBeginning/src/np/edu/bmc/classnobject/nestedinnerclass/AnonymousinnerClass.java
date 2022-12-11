
package np.edu.bmc.classnobject.nestedinnerclass;
public class AnonymousinnerClass {
    public static void main(String[] args) {
        Parent p = new Parent(){
        @Override
        public void method1(){
            System.out.println("I am the method of the abstrat class defined from anonymous inner class");
            
        }
        
    };
        p.method1();
    }
}
 abstract class Parent{
     public abstract void method1();
     
 }
