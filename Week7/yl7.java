package Week7;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class yl7 {

    public static class Dictionary {
        private HashMap<String, String> translations;

        public Dictionary() {
            this.translations = new HashMap<>();
        }

        public String translate(String word) {
            return this.translations.get(word);
        }

        public void add(String word, String translation) {
            this.translations.put(word, translation);
        }

        public int amountOfWords() {
            return this.translations.size();
        }

        public ArrayList<String> translationList() {
            ArrayList<String> translationList = new ArrayList<>();
            for (String key : this.translations.keySet()) {
                translationList.add(key + " = " + this.translations.get(key));
            }
            return translationList;
        }
    }

    public static class TextUserInterface {
        private Scanner reader;
        private Dictionary dictionary;

        public TextUserInterface(Scanner reader, Dictionary dictionary) {
            this.reader = reader;
            this.dictionary = dictionary;
        }

        public void start() {
            System.out.println(
                    "Statements:\n  add - adds a word pair to the dictionary\n  translate - asks a word and prints its translation\n  quit - quits the text user interface");

            while (true) {
                System.out.print("\nStatement: ");
                String command = this.reader.nextLine();

                if (command.equals("quit")) {
                    System.out.println("Cheers!");
                    break;
                } else if (command.equals("add")) {
                    System.out.print("In Finnish: ");
                    String word = this.reader.nextLine();
                    System.out.print("Translation: ");
                    String translation = this.reader.nextLine();
                    this.dictionary.add(word, translation);
                } else if (command.equals("translate")) {
                    System.out.print("Give a word: ");
                    String word = this.reader.nextLine();
                    String translation = this.dictionary.translate(word);
                    System.out.println("Translation: " + (translation != null ? translation : "Word not found"));
                } else {
                    System.out.println("Unknown statement");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }

}