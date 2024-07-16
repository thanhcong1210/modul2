package bai_tap_bo_sung.luyen_tap_tinh_ke_thua;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + this.radius
                + " And color is " +this.color;
    }
}
    /*
    1. thành phần nào được kế thừa : Cylinder
    2. thành phần nào không được kế thừa : Circle
    3. Đâu là overload : là phần triển khai contructor không tham số và có tham số
    4. Đâu là override : là phần toString của 2 class
    */