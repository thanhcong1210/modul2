package ss7.BaiTapVeNha.staff;

public class Shipper extends Staff{
    protected String typeVehicle;
    public Shipper() {}
    public Shipper(int id, String name, String phone, String position, String typeVehicle) {
        super(id, name, phone, position);
        this.typeVehicle = typeVehicle;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                ", typeVehicle='" + typeVehicle + '\'' +
                '}';
    }
}
