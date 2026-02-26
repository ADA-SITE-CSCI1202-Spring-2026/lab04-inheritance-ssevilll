public class Student extends Person {
    public int studentId;

    public Student(String firstName, String lastName, boolean gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId; 
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }

    public boolean equals(Student other) {
        return super.equals(other) && this.studentId == other.studentId;
    }
    
}
