
package np.edu.bmc.Threading;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
              System.out.println("Iम खाना पकौदै छु");
              System.out.println("wau I am so excited");
              i++;
        }
      
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<1000){
              System.out.println("म गफ गर्दै छु");
              System.out.println("I am happy");
              i++;
        }
      
    }
}
public class MThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        
        MyThread2 t2 = new MyThread2();
        System.out.println(t2.isAlive());
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        
    }
}
