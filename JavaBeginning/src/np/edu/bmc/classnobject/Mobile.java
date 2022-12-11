package np.edu.bmc.classnobject;

public class Mobile {

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

    public static void main(String[] args) {
        Mobile apple = new Mobile();
        apple.ram = 6;
        apple.battery = 5000;
        apple.version = "6.07E";
        apple.cameraPixels = 100.015f;
        apple.call();
        apple.takePic();
        apple.playChessGame();
        //ctrl shift downarrow
        System.out.println("specification of mobile");
        System.out.println("Ram:" + apple.ram);
        System.out.println("battery:" + apple.battery);
        System.out.println("Version:" + apple.version);
        System.out.println("CameraPixels" + apple.cameraPixels);
        System.out.println("IsWifi:" + apple.isWifi);
        
          Mobile nokia = new Mobile();
          nokia.ram=2;
          nokia.battery = 70000;
          nokia.version = "3310";
          nokia.cameraPixels = 0.0f;
          nokia.isWifi = false;
          
          System.out.println("nokia specs:");
          System.out.println("Ram:"+nokia.ram);
          System.out.println("battery: "+nokia.battery);
          System.out.println("Version:"+nokia.version);
          System.out.println("Camera"+nokia.cameraPixels);
          System.out.println("Wifi present:"+nokia.isWifi);
          
          
    }
}
