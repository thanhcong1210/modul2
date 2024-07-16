package bai_tap_bo_sung.luyen_tap_tinh_ke_thua;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){}

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }


    @Override
    public String toString() {
        return "A Cylinder with height is"
                + this.height
                + " , which is subclass of"
                + super.toString();
    }
}
