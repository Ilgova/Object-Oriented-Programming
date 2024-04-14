import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        List<Integer> studentIds = Arrays.asList(1, 2, 3);
        StudyGroup group = controller.formStudyGroup(10, studentIds);

        System.out.println("Учебная группа была сформирована из " + group.getTeacher().getId()
               +" преподавателей" + " и " + group.getStudents().size() +" студентов." );
    }
}