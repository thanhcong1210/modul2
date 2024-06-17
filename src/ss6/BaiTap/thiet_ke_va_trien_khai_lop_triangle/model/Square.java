package ss6.BaiTap.thiet_ke_va_trien_khai_lop_triangle.model;

public class Square {

    private String color = "green";
    private boolean filled = true;

    public Square(int i){
    }
    public Square(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public  String getColor(){
        return color;
    }
    public void setColor(String color){
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
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
