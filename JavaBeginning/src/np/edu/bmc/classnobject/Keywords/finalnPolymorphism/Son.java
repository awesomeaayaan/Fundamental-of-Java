
package np.edu.bmc.classnobject.Keywords.finalnPolymorphism;

public class Son extends Father {
    final int a=10;
    @Override
    public void  gift(){
        System.out.println("bullet bike");
    }
    public static void main(String[] args) {
        final int B;//b become constant
        //once assigned any value, that variable become constant
        B=20;
     
    
        Father ff = new Father();
        ff.gift();
        Son s = new Son();
        Father f = new Son();
        
        f.gift();
        
        s.gift();
    }
    
}
