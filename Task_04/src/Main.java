import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        teacherController.createTeacher("Денис Петрович", "Алгебра");
        teacherController.createTeacher("Майя Игоревна", "Русский язык");

        teacherController.showAllTeachers();

        teacherController.editTeacher(1, "Алиса Александровна", "История");

        teacherController.showAllTeachers();
    }
}
