
package np.edu.bmc.classnobject.inheritance.Single;


public class Child extends Parent {
    int propertyC = 500000;
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.eyeColor);
        System.out.println(c.propertyP);
        System.out.println(c.propertyC);
        c.Car(); 
        Parent p = new Parent();
        System.out.println(p.propertyP);
        //System.out.println(p.property2);
        
    }
}
