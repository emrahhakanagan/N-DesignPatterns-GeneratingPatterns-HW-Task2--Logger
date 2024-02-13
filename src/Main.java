import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int N = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int M = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add((int) (Math.random() * (M + 1)));
        }
        logger.log("Вот случайный список: " + list.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();
        Filter filter = new Filter(f);

        logger.log("Запускаем фильтрацию");
        List<Integer> filteredList = filter.filterOut(list);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);

        logger.log("Завершаем программу");
    }
}
