package ss7.BaiTap.trien_khai_interface_resizeaable;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape(false, "red");
        System.out.println(shape);
    }
}
