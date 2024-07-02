package luyen_tap_modul2.model;

public class Car {
    private int numberOfSeats;
    private String vehicleType;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Car(int numberOfSeats, String vehicleType) {
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
