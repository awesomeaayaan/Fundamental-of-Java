
package np.edu.bmc.AccessPrivilage.AnotherPackage;
import np.edu.bmc.AccessPrivilage.AccessSpecifier;
public class AnotherClass extends AccessSpecifier {
    public static void main(String[] args) {
        AccessSpecifier as = new AccessSpecifier();
        System.out.println(as.varPublic);
        AnotherClass ac = new AnotherClass();
        System.out.println(ac.varProcted);
        //System.out.println(as.varDefault);
        System.out.println(ac.getPrivateVariable());
    }
    
}
