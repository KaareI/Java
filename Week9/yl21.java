package Week9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class yl21 {
    private String fileName;

    public yl21(String fileName) throws Exception {
        this.fileName = fileName;
    }

    public void printLinesWhichContain(String word) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (word.isEmpty() || line.contains(word)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            yl21 printer = new yl21("C:/KOOL/Java/Week9/textfile.txt");

            printer.printLinesWhichContain("Väinämöinen");
            System.out.println("-----");
            printer.printLinesWhichContain("Frank Zappa");
            System.out.println("-----");
            printer.printLinesWhichContain("");
            System.out.println("-----");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
