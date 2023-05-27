import java.util.HashMap;
import java.util.Map;

public class Employees {

    public static void main(String[] args) {
        HashMap<String, String> employees = new HashMap<>();
        employees.put("Иван", "Иванов");
        employees.put("Светлана", "Петрова");
        employees.put("Кристина", "Белова");
        employees.put("Анна", "Мусина");
        employees.put("Анна", "Крутова");
        employees.put("Иван", "Юрин");
        employees.put("Петр", "Лыков");
        employees.put("Павел", "Чернов");
        employees.put("Петр", "Чернышов");
        employees.put("Мария", "Федорова");
        employees.put("Марина", "Светлова");
        employees.put("Мария", "Савина");
        employees.put("Мария", "Рыкова");
        employees.put("Марина", "Лугова");
        employees.put("Анна", "Владимирова");
        employees.put("Иван", "Мечников");
        employees.put("Петр", "Петин");
        employees.put("Иван", "Ежов");


        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : employees.keySet()) {

            if (nameCount.containsKey(name)) {
                int count = nameCount.get(name);
                nameCount.put(name, count + 1);
            } else {
                nameCount.put(name, +1);
                System.out.println(nameCount);
            }
            //не получается записать в список кол-во имен, чтобы провести сортировку


        }


    }}