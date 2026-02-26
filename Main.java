public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Min: " + MathDemo.min(a, b));
        System.out.println("Max: " + MathDemo.max(a, b));
        System.out.println("Sum: " + MathDemo.sum(numbers));

        Student student1 = new Student("John", "Doe", false, 12345);
        Teacher teacher1 = new Teacher("Jane", "Smith", true, "Computer Science", new String[]{"CS101", "CS102"});
        Person person1 = new Person("Alice", "Johnson", true);
        PhdStudent phdStudent1 = new PhdStudent("Emily", "Brown", true, 54321, "Mathematics", new String[]{"Math101", "Math102"});

        System.out.println(student1);
        System.out.println(teacher1);
        System.out.println(person1);
        System.out.println(phdStudent1);
    }
}
