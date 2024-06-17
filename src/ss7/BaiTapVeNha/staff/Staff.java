package ss7.BaiTapVeNha.staff;

public class Staff {
    protected int id;
    protected String name;
    protected String phone;
    protected String position;
    public Staff(){}
    public Staff(int id, String name, String phone, String position) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
