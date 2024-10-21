import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Word> words1 = List.of(
                new Word("dog", "собака"),
                new Word("cat", "кот"),
                new Word("book", "книга"),
                new Word("table", "стол")
        );

        List<Word> words2 = new ArrayList<>();
        words2.add(new Word("bed", "кровать"));
        words2.add(new Word("flower", "цветок"));

        Dictionary dictionary = new Dictionary(words2);

        dictionary.addWord(words1.get(0));

        menu(scanner, dictionary);

        scanner.close();
    }

    public static void menu(Scanner scanner, Dictionary dictionary) {
        int mode = 1;
        while (true) {
            System.out.println("Выберите режим работы: \n'1' - прямой перевод \n'2' - обратный перевод \n'3' - все слова \n'0' - завершить программу");
            mode = scanner.nextInt();
            scanner.nextLine(); //очистить поток ввода
            if (mode == 0) break;
            String word = "";
            if (mode == 1) {
                System.out.println("Введите слово:");
                word = scanner.nextLine();
                System.out.println("Перевод: " + dictionary.translation(word));
            } else if (mode == 2) {
                System.out.println("Введите перевод:");
                word = scanner.nextLine();
                System.out.println("Слово: " + dictionary.getWordByTranslation(word));
            } else if (mode == 3) {
                System.out.println("Текущий словарь:");
                System.out.print(dictionary);
            }
            System.out.println("_____________________________________________________");
        }
    }
}