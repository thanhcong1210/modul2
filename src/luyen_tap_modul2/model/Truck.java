package luyen_tap_modul2.model;

public class Truck {
    private String payLoad;

    public Truck(String payLoad) {
        this.payLoad = payLoad;
    }

    public String getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(String payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "payLoad='" + payLoad + '\'' +
                '}';
    }
}
