package Week3;

import java.util.Scanner;

public class yl50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        if (name.length() > 2) {
            int index = 0;
            while (index < 3) {
                System.out.println(index + 1 + ". character: " + name.charAt(index));
                index++;
            }
        }
        reader.close();
    }
}
