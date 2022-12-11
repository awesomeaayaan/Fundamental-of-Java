
package np.edu.bmc.AccessPrivilage;


public class AccessSpecifier {
    public int varPublic=10;
   int varDefault=11;
   protected int varProcted=12;
   private int  varPrivate = 13;
   
   public int getPrivateVariable(){
       return varPrivate;
   }
   
   public static void main(String[] args) {
        AccessSpecifier as = new AccessSpecifier();
        System.out.println(as.varPublic);
        System.out.println(as.varDefault);
        System.out.println(as.varPrivate);
        System.out.println(as.varProcted);
        
    }
    
}

