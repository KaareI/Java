package Week4;

public class yl83 {
    public static class HangmanLogic {

        private String word;
        private String guessedLetters;
        private int numberOfFaults;

        public HangmanLogic(String word) {
            this.word = word.toUpperCase();
            this.guessedLetters = "";
            this.numberOfFaults = 0;
        }

        public int numberOfFaults() {
            return this.numberOfFaults;
        }

        public String guessedLetters() {
            return this.guessedLetters;
        }

        public int losingFaultAmount() {
            return 12;
        }

        public void guessLetter(String letter) {
            // program here the functionality for making a guess

            // if the letter has already been guessed, nothing happens
            if (this.guessedLetters.contains(letter)) {
                return;
            }
            // it the word does not contains the guessed letter, the number of faults
            // increases
            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
            }
            // the letter is added among the already guessed letters
            this.guessedLetters += letter;
        }

        public String hiddenWord() {
            // program here the functionality for building the hidden word

            // create the hidden word by iterating through this.word letter by letter
            // if the letter in turn is within the guessed words, put it in the hidden word
            // if the letter is not among the guessed ones, replace it with _ in the hidden
            // word
            String hiddenWord = "";
            for (int i = 0; i < this.word.length(); i++) {
                char currentChar = this.word.charAt(i);
                boolean guessed = false;
                
                for (int g = 0; g < this.guessedLetters.length(); g++) {
                    if (currentChar == this.guessedLetters.charAt(g)) {
                        hiddenWord += currentChar;
                        guessed = true;
                        break; // Exit the inner loop once a match is found.
                    }
                }
                
                if (!guessed) {
                    hiddenWord += "_";
                }
            }
            
            // return the hidden word at the end

            return hiddenWord;
        }
    }

    public static void main(String[] args) {

        HangmanLogic l = new HangmanLogic("kissa");
        System.out.println("word is: " + l.hiddenWord());

        System.out.println("guessing: A, D, S, F, D");
        l.guessLetter("A");
        l.guessLetter("D");
        l.guessLetter("S");
        l.guessLetter("F");
        l.guessLetter("D");
        System.out.println("guessed letters: " + l.guessedLetters());
        System.out.println("number of faults: " + l.numberOfFaults());
        System.out.println("word now: " + l.hiddenWord());

    }

}
