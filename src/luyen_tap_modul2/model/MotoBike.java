package luyen_tap_modul2.model;

public class MotoBike {
    private String power;

    public MotoBike(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "power='" + power + '\'' +
                '}';
    }
}
