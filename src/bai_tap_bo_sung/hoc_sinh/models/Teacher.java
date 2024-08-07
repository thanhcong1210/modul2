package bai_tap_bo_sung.hoc_sinh.models;

public class Teacher extends Person{
    private int teacherID;
    static final int lasted_id = 0;

    public Teacher(String name, String dateOfBirth, String gender, String phoneNumber) {
        super(name, dateOfBirth, gender, phoneNumber);
        this.teacherID = lasted_id+1;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

}
