package ss7.BaiTapVeNha.staff;

public class Factory_Staff extends Staff{
    protected String idFactory;
    protected String type;

    public Factory_Staff(int id, String name, String phone, String position, String idFactory, String type) {
        super(id, name, phone, position);
        this.idFactory = idFactory;
        this.type = type;
    }

    public void setIdFactory(String idFactory) {
        this.idFactory = idFactory;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdFactory() {
        return idFactory;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "FactoryStaff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                ", idFactory='" + idFactory + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
