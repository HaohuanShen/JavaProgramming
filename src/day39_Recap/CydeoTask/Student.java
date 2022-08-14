package day39_Recap.CydeoTask;

public class Student extends Person {

    private int studentId;
    private String fieldOfStudy;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {

        if (studentId <= 0) {
            System.err.println("Invalid student ID");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (!(fieldOfStudy == null || fieldOfStudy.isBlank() || fieldOfStudy.isEmpty())) {
            System.err.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study() {
        System.out.println(getName() + " " + getGender() + " " + getAge() + " " + getStudentId()
                + " is studying " + getFieldOfStudy());
    }
}
