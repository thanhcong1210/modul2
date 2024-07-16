package luyen_tap.khong_biet.models;

public class Teacher extends Person{
    private int teacherID;
    static final int lase_id = 0;

    public Teacher(String name, String dateOfBirth, String gender, String phoneNumber, int teacherID) {
        super(name, dateOfBirth, gender, phoneNumber);
        this.teacherID = lase_id + 1;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }
}
