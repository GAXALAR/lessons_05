import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> book;

    public PhoneBook() {
        book = new HashMap<String, ArrayList<String>>();
    }

    public void addNumber(String name, String number) {
        if (book.containsKey(name)) {
            ArrayList<String> numbers = book.get(name);
            numbers.add(number);
        } else {
            ArrayList<String> numbers = new ArrayList<String>();
            numbers.add(number);
            book.put(name, numbers);
        }
    }

    public void printAll() {
        for (Map.Entry<String, ArrayList<String>> entry : book.entrySet()) {
            String name = entry.getKey();
            ArrayList<String> numbers = entry.getValue();
            System.out.print(name + ": ");
            for (String number : numbers) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Введите 1 - добавить номер, 2 - вывести всю книгу, 3 - выйти:");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Введите фамилию:");
                String name = scanner.next();
                System.out.println("Введите номер:");
                String number = scanner.next();
                phoneBook.addNumber(name, number);
            } else if (choice == 2) {
                phoneBook.printAll();
            } else if (choice == 3) {
                System.out.println("всего доброго");
                break;
            } else {
                System.out.println("Неверный выбор");

            }
        }
    }
}