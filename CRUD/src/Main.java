import java.util.ArrayList;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();

    // CREATE
    public static void addStudent(int id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added!");
    }

    // READ
    public static void viewStudents() {
        for (Student s : students) {
            System.out.println(s.id + " - " + s.name);
        }
    }

    // UPDATE
    public static void updateStudent(int id, String newName) {
        for (Student s : students) {
            if (s.id == id) {
                s.name = newName;
                System.out.println("Student updated!");
            }
        }
    }

    // DELETE
    public static void deleteStudent(int id) {
        students.removeIf(s -> s.id == id);
        System.out.println("Student deleted!");
    }

    public static void main(String[] args) {

        // Create
        addStudent(1, "Rahul");
        addStudent(2, "Amit");

        // Read
        System.out.println("All Students:");
        viewStudents();

        // Update
        updateStudent(1, "Rahul Sharma");

        // Read again
        System.out.println("After Update:");
        viewStudents();

        // Delete
        deleteStudent(2);

        // Final list
        System.out.println("After Delete:");
        viewStudents();
    }
}