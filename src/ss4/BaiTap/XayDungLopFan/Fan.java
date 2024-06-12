package ss4.BaiTap.XayDungLopFan;

public class Fan {

    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(int i, boolean b, int i1, String yellow) {}

    public int getSLOW() {
        return SLOW;
    }
    public int getMEDIUM() {
        return MEDIUM;
    }
    public int getFAST() {
        return FAST;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public String to_string() {
        return null;
    }
}
