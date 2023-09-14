package Week3;

import java.util.Scanner;
import java.util.ArrayList;

public class yl57 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        words.add(word);
        while (word.length() != 0) {
            System.out.println("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }
                System.out.println("You typed the following words:");
        for(String output : words){
            System.out.println(output);
        }
        reader.close();
    }
}
