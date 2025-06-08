public class Student {
    String name;
    int age;
    String course;

    // Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", course='" + course + "'}";
    }

    // Main method to test
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "Computer Science");
        System.out.println(s1); // Automatically calls s1.toString()
    }
}