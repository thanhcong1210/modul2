package ss6.BaiTap.thiet_ke_va_trien_khai_lop_triangle.model;

import ss6.BaiTap.thiet_ke_va_trien_khai_lop_triangle.service.IResizeable;

public class Circle extends Square implements IResizeable {
    public double radius = 1.0;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of"
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius() * percent);
    }
}
