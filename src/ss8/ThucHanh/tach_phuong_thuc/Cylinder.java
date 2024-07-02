package ss8.ThucHanh.tach_phuong_thuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = Math.PI * radius;
        double perimeter = 2 * Math.PI * radius;
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
}
