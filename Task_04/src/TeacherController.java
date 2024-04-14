import java.util.List;

class TeacherController {
    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void createTeacher(String fullName, String subject) {
        teacherService.addTeacher(fullName, subject);
    }

    public void editTeacher(int index, String fullName, String subject) {
        teacherService.updateTeacher(index, fullName, subject);
    }

    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.displayTeachers(teachers);
    }
}
