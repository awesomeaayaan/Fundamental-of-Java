
package np.edu.bmc.classnobject;



public class Assembly {
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
    }
}
