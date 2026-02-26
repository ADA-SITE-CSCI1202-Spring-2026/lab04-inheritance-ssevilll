public class Teacher extends Person {
    public String department;

    public String[] courses;

    public Teacher(String firstName, String lastName, boolean gender, String department, String[] courses) {
        super(firstName, lastName, gender);
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

    public boolean equals(Teacher other) {
        return super.equals(other) && this.department.equals(other.department) && java.util.Arrays.equals(this.courses, other.courses);
    }
}
