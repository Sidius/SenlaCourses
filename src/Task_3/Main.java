package Task_3;

import java.util.Scanner;

public class Main {

    private static boolean flag = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");

        System.out.println("Count words: " + words.length + "\n");

        var sort_words = sortWords(words);

        for (var word : sort_words) {
            System.out.println(word);
        }

        for (int i = 0; i < sort_words.length; i++) {
            sort_words[i] = toFirstUpper(sort_words[i]);
        }
        System.out.println();
        for (var word : sort_words) {
            System.out.println(word);
        }
    }

    private static String toFirstUpper(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    private static String[] sortWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    var rev = words[i];
                    words[i] = words[j];
                    words[j] = rev;
                }
            }
        }
        return words;
    }
}
