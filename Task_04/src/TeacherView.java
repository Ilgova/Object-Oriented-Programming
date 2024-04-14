import java.util.List;

class TeacherView {
    public void displayTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println("Преподаватель: " + teacher.getFullName() + ", Предмет: " + teacher.getSubject());
        }
    }
}
