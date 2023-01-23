import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppinglist = new ArrayList<>();
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1 - Добавить");
            System.out.println("2 - Показать");
            System.out.println("3 - Удалить");
            String value = scanner.nextLine();
            if (value.equals("end")) {
                break;
            } else {
                switch (value) {
                    case "1":
                        System.out.println("Какую покупку хотите добавить?");
                        value = scanner.nextLine();
                        shoppinglist.add(value);
                        System.out.println("Итого в списке покупок: " + shoppinglist.size());
                        break;
                    case "2":
                        System.out.println("Список покупок:");
                        for (int i = 0; i < shoppinglist.size(); i++) {
                            System.out.println((i + 1) + " " + shoppinglist.get(i));
                        }
                        break;
                    case "3":
                        System.out.println("Список покупок:");
                        for (int i = 0; i < shoppinglist.size(); i++) {
                            System.out.println((i + 1) + " " + shoppinglist.get(i));
                        }
                        System.out.println("Какую хотите удалить? Введите номер или название");
                        value = scanner.nextLine();
                        try {
                            int numItem = Integer.parseInt(value);
                            shoppinglist.remove(numItem - 1);
                        } catch (NumberFormatException e) {
                            shoppinglist.remove(value);
                        }
                        ;
                        break;
                }
            }
        }

    }
}