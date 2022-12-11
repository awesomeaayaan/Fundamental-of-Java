
package np.edu.bmc.classnobject;


public class Constructors {
     int ram;
    int battery;
    String version;
    float cameraPixels;
    boolean isWifi = true;

    public void call() {
        System.out.println("tring tring tring!!!");
    }

    public void takePic() {
        System.out.println("Click");
    }

    public void playChessGame() {
        System.out.println("zoom");
    }
    
    public Constructors(int ram,int battery, String version,float cameraPixels,boolean isWifi){
        this.ram = ram;
        this.battery = battery;
        this.version = version;
        this.cameraPixels = cameraPixels;
        this.isWifi = isWifi;
        
        
    }
}
