package luyen_tap.khong_biet.models;

public class Student extends Person{
    private static int lastedStudentCode = 0;
    private int studentCode;
    private String classCode;

    public Student(String name, String dateOfBirth, String gender, String phoneNumber, String classCode) {
        super(name, dateOfBirth, gender, phoneNumber);
        this.studentCode = studentCode;
        this.classCode = classCode;
    }

    public static int getLastedStudentCode() {
        return lastedStudentCode;
    }

    public static void setLastedStudentCode(int lastedStudentCode) {
        luyen_tap.khong_biet.models.Student.lastedStudentCode = lastedStudentCode;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode=" + studentCode +
                ", classCode='" + classCode + '\'' +
                '}';
    }
}
