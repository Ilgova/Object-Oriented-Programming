import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        // Создаем список учебных групп
        List<StudyGroup> groups = new ArrayList<>();

        // Вводим учебные группы с клавиатуры
        System.out.println("Введите названия учебных групп (для завершения введите пустую строку):");
        String groupName;
        while (!(groupName = scanner.nextLine()).isEmpty()) {
            groups.add(new StudyGroup(groupName));
        }

        // Создаем поток
        Flow flow = new Flow("Поток 1", groups);

        // Добавляем поток в контроллер
        controller.setFlows(List.of(flow));

        // Сортируем потоки по количеству групп
        controller.sortFlows();

        // Печатаем отсортированный список потоков
        for (Flow flow1 : controller.getFlows()) {
            System.out.println(flow1.getName());
        }
    }
}