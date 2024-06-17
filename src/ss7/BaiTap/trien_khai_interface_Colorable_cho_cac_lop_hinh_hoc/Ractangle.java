package ss7.BaiTap.trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class Ractangle extends Shape{

    private double width = 1.0;
    private double length = 1.0;

    public Ractangle() {
    }

    public Ractangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Ractangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
