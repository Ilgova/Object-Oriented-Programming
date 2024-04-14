import java.util.ArrayList;
import java.util.List;

class TeacherService {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(String fullName, String subject) {
        Teacher teacher = new Teacher(fullName, subject);
        teachers.add(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public void updateTeacher(int index, String fullName, String subject) {
        Teacher teacher = new Teacher(fullName, subject);
        teachers.set(index, teacher);
    }
}
