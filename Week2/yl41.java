import java.util.Scanner;
import java.util.Random;

public class yl41 {

    public static void main(String[] args) {

        int guess;
        int guessesMade = 0;
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        boolean correctGuess = false;
        Scanner reader = new Scanner(System.in);

        System.out.print("Number guessing game from 0-10\n");

        while (!correctGuess) {

            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());

            guessesMade++;

            if (guess < randomNumber) {
                System.out.print("The number is greater, guesses made: " + guessesMade + "\n");
            } else if (guess > randomNumber) {
                System.out.print("The number is lesser, guesses made: " + guessesMade + "\n");
            } else {
                correctGuess = true;
            }

        }

        System.out.print("Congratulations, your guess is correct!\n\n");
        reader.close();

    }

}
