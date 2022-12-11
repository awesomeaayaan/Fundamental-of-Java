
package np.edu.bmc.Threading.Priorities;
 class ThreadDemo extends Thread {
    String tname;
    ThreadDemo(String n){
        tname=n;
    }
    public void run(){
        for(int i=9;i>0;i--){
            System.out.println(tname + "Printing"+i);
        }
        
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        ThreadDemo x = new ThreadDemo("T1");
        ThreadDemo y = new ThreadDemo("T2");
        ThreadDemo z = new ThreadDemo("T3");
        x.setPriority(10);
        y.setPriority(1);
        int p = z.getPriority();
        System.out.println("Priority of z:"+p);
        x.start();
        y.start();
        z.start();
                
                
        
    }
    
}
