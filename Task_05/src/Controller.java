import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Controller {

    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup formStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = new Teacher(teacherId);
        List<Student> students = new ArrayList<>();
        for (int id : studentIds) {
            students.add(new Student(id));
        }
        return studyGroupService.createStudyGroup(teacher, students);
    }

}