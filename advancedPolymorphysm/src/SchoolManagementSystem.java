
import java.util.ArrayList;
import java.util.List;

public class SchoolManagementSystem {
    private List<Student> students;
    private List<Integer> grades;

    public SchoolManagementSystem() {
        students = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void assignGrade(String studentName, int grade) {
        try {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Invalid grade: " + grade);
            }
            students.add(new Student(studentName));
            grades.add(grade);
            System.out.println("Grade assigned successfully to " + studentName + ": " + grade);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Grade assignment attempted for " + studentName);
        }
    }
}
