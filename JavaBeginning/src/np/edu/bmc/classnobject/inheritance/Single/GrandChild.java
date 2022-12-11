
package np.edu.bmc.classnobject.inheritance.Single;


public class GrandChild extends Child {
    int propertyG = 2000;
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        System.out.println(gc.eyeColor);
        System.out.println(gc.propertyC);
        System.out.println(gc.propertyG);
    }
    
}
