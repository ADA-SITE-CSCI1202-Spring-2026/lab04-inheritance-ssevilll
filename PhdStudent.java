public class PhdStudent extends Student {
    public String department;
    public String[] courses;

    public PhdStudent(String firstName, String lastName, boolean gender, int studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;   
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Courses: " + String.join(", ", courses);
    }

    public boolean equals(PhdStudent other) {
        return super.equals(other) && this.department.equals(other.department) && java.util.Arrays.equals(this.courses, other.courses);
    }
}
