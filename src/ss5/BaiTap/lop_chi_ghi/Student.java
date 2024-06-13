package ss5.BaiTap.lop_chi_ghi;

public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "John";
        classes = "CO2";
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    void setClasses(String classes) {
        this.classes = classes;
    }
}
