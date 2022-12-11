
package np.edu.bmc.Threading;


public class MultiThread extends Thread  {
    
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
             try{Thread.sleep(500); }catch(InterruptedException e){}
        }
    }
    
}
class AnotherThread extends Thread{
    @Override
    public void run(){
        for(int i=11;i<=20;i++){
            System.out.println(i);
             try{Thread.sleep(1000); }catch(InterruptedException e){}
            
        }
        
    }
    public static void main(String[] args) {
        AnotherThread At = new AnotherThread();
        MultiThread Mt = new MultiThread();
        At.setPriority(10);
        At.start();
        Mt.start();
    }
   
}

