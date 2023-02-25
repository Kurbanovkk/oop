import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        // Создаем несколько объектов Notebook
        Notebook notebook1 = new Notebook("Acer Aspire", "Intel Core i5", 8, 500, "Windows 10", "черный");
        Notebook notebook2 = new Notebook("HP Pavilion", "Intel Core i7", 16, 1000, "Windows 10", "серебряный");
        Notebook notebook3 = new Notebook("Lenovo ThinkPad", "Intel Core i7", 16, 512, "Windows 10", "черный");

        // Создаем множество ноутбуков и добавляем созданные объекты в него
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);

        // Создаем Map для хранения критериев фильтрации и их значений
        Map<String, Object> filterCriteria = new HashMap<>();

        // Запрашиваем у пользователя критерии фильтрации
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите критерии фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criteriaChoice = scanner.nextInt();

        // Запрашиваем у пользователя значения критериев фильтрации
        switch (criteriaChoice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int ram = scanner.nextInt();
                filterCriteria.put("ram", ram);
                break;
            case 2:
                System.out.println("Введите минимальный объем жесткого диска:");
                int hardDisk = scanner.nextInt();
                filterCriteria.put("hardDisk", hardDisk);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                filterCriteria.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filterCriteria.put("color", color);
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        // Фильтруем ноутбуки по критериям
        Set<Notebook> filteredNotebooks = filterNotebooks(notebooks, filterCriteria);

        // Выводим отфильтрованные ноутбуки
        if (filteredNotebooks.isEmpty()) {
            System.out.println("По заданным критериям ноутбуки не найдены.");
        } else {
            System.out.println("Найденные ноутбуки:");
            for (Notebook notebook : filteredNotebooks) {
                System.out.println(notebook.toString());
            }
        }
    }

    public static Set<Notebook> filterNotebooks(Set<Notebook> notebooks, Map<String, Object> filterCriteria) {
        Set<Notebook> filteredNotebooks = new HashSet<>(notebooks);

        for (String key : filterCriteria.keySet()) {
            switch (key) {
                case "RAM":
                    int minRam = (int) filterCriteria.get(key);
                    filteredNotebooks = filteredNotebooks.stream()
                            .filter(notebook -> notebook.getRam() >= minRam)
                            .collect(Collectors.toSet());
                    break;
                case "storage":
                    int minStorage = (int) filterCriteria.get(key);
                    filteredNotebooks = filteredNotebooks.stream()
                            .filter(notebook -> notebook.getStorageCapacity() >= minStorage)
                            .collect(Collectors.toSet());
                    break;
                case "OS":
                    String os = (String) filterCriteria.get(key);
                    filteredNotebooks = filteredNotebooks.stream()
                            .filter(notebook -> notebook.getOs().equals(os))
                            .collect(Collectors.toSet());
                    break;
                case "color":
                    String color = (String) filterCriteria.get(key);
                    filteredNotebooks = filteredNotebooks.stream()
                            .filter(notebook -> notebook.getColor().equals(color))
                            .collect(Collectors.toSet());
                    break;
                default:
                    System.out.println("Unknown filter criteria: " + key);
            }
        }

        return filteredNotebooks;
    }
}
