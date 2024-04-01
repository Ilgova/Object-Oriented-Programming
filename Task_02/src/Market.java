import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Класс магазина
class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<String> queue = new LinkedList<>();
    private String order;

    // Добавление человека в очередь
    @Override
    public void addToQueue(String person) {
        queue.offer(person);
        System.out.println(person + " добавлен в очередь.");
    }

    // Удаление человека из очереди
    @Override
    public void removeFromQueue() {
        String person = queue.poll();
        System.out.println(person + " удален из очереди.");
    }

    // Отображение очереди
    @Override
    public void showQueue() {
        System.out.println("Очередь: " + queue);
    }

    // Добавление заказа
    @Override
    public void addOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите заказ: ");
        order = scanner.nextLine();
        scanner.close();
    }

    // Обновление состояния магазина
    @Override
    public void update() {
        addToQueue("Иван");
        addToQueue("Мария");
        showQueue();
        addOrder();
        System.out.println("Заказ получен: " + order);
        removeFromQueue();
        showQueue();
    }
}
