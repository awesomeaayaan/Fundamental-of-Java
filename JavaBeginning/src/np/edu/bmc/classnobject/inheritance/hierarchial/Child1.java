
package np.edu.bmc.classnobject.inheritance.hierarchial;


public class Child1 extends Parent {
    int propertyC1 = 200;
    public static void main(String[] args) {
        Child1  c1 = new Child1(); 
        System.out.println(c1.propertyC1);
        System.out.println(c1.propertyP);
    }
    
}
