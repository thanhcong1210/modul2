package ss21.thuc_hanh.trien_khai_object_pool;

public class Taxi {
    private String name;

    public Taxi() {
    }

    public Taxi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "name='" + name + '\'' +
                '}';
    }
}
