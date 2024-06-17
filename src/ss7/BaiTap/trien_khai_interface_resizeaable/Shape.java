package ss7.BaiTap.trien_khai_interface_resizeaable;

public class Shape {
    public boolean filled = true;
    public String color = "red";

    public Shape() {
    }
    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    @Override
    public String toString(){
        return "A Shape with color of"
                + color
                + "and"
                + (filled? "filled" : "not filled");
    }
}
