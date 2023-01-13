
package np.edu.bmc.classnobject.Keywords.finalnPolymorphism;
public class Child extends Parent {
    public double area(float l){
        return l*l;
    }
    public static void main(String[] args) {
        Child c = new Child();
 
        System.out.println("the area of the square is "+c.area(2.0f));
    }
}
