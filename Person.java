public class Person {
    public String firstName;
    public String lastName;
    public boolean gender;

    public Person(String firstName, String lastName, boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;   
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + ", Last Name: " + lastName + ", Gender: " + (gender ? "Female" : "Male");
    }

    public boolean equals(Person other) {
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName) && this.gender == other.gender;
    }


}
