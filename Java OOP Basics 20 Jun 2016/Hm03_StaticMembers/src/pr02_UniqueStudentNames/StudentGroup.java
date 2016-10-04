package pr02_UniqueStudentNames;

import java.util.HashSet;
import java.util.Set;

public class StudentGroup {
    private Set<Student> students;
    private static Integer count = 0;

    public StudentGroup() {
        this.students = new HashSet<>();
    }

    public static Integer getCount() {
        return count;
    }

    public void addStudent(Student student) {
        this.tryIncrementCount(student);
        this.students.add(student);
    }

    private void tryIncrementCount(Student student) {
        for (Student myStudent : this.students) {
            if (myStudent.getName().equals(student.getName())) {
                return;
            }
        }

        count++;
    }
}
