package ss7.BaiTap.trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;


public class RactangleTest {
    public static void main(String[] args) {
        Ractangle rectangle = new Ractangle();
        System.out.println(rectangle);

        rectangle = new Ractangle(2.3,  5.8);
        System.out.println(rectangle);

        rectangle = new Ractangle(2.5, 5.8, "orange", true);
        System.out.println(rectangle);
    }
}
