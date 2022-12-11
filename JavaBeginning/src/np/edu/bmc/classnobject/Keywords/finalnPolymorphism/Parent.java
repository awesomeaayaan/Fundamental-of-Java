
package np.edu.bmc.classnobject.Keywords.finalnPolymorphism;
public class Parent {
    public double area(double r){
        return Math.PI*r*r;
    }
    public double area(double l,double b){
        return l*b;
    }
   
    public static void main(String[] args) {//overload for same class level
        Parent p = new Parent();
        System.out.println(p.area(10.0));
        System.out.println(p.area(5.0,6.0));
    }
}
