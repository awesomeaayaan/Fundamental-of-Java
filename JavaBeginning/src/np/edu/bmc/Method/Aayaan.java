
package np.edu.bmc.Method;


public class Aayaan {
   
    public static void main(String[] args) {
         Worldlink w = new Worldlink();
        System.out.println("brush refresh");
        System.out.println("no internet");
        w.complain();
        cook();
        w.complain();
        System.out.println("Ac not working");
        int change = electrician(500);
        w.complain();
        
    }
    public static void cook(){
        System.out.println("Food is prepared");
    }
    public static int electrician(int given){ 
        int charge = 300;
        System.out.println("repaired please give me "+charge);
        return given-charge;
    }
}
