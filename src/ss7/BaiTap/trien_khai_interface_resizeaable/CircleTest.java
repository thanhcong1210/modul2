package ss7.BaiTap.trien_khai_interface_resizeaable;

import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Random random = new Random();
        Circle [] circle = new Circle[20];
        int length = circle.length;

        for (int i = 0; i < length; i++) {
            circle[i] = new Circle(10);
        }
        for (int i = 0; i < length; i++) {
            System.out.println("================================================");
            System.out.println("Shape" + (i + 1) + ":");
            System.out.println("Area before resize: " + circle[i].getArea());
            int percent = (int) (random.nextDouble() * 100);
            System.out.println("percent: " + percent);
            circle[i].resize(percent);
            System.out.println("Area after resize: " + circle[i].getArea());
        }
    }
}
