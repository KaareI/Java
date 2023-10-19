package Week6;

import java.util.Arrays;

public class yl98 {

    public static int[] copy(int[] array) {

        int[] newCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newCopy[i] = array[i];
        }

        return newCopy;

    }

    public static int[] reverseCopy(int[] array) {

        int[] newCopy = new int[array.length];
        int u = 0;
        for (int i = array.length -1; i >= 0; i--) {
            newCopy[u] = array[i];
            u++;
        }

        return newCopy;

    }

    public static void main(String[] args) {
        /* 98.1 TESTING */
        /*
         * int[] original = { 1, 2, 3, 4 };
         * int[] copied = copy(original);
         * 
         * // change the copied
         * copied[0] = 99;
         * 
         * // print both
         * System.out.println("original: " + Arrays.toString(original));
         * System.out.println("copied: " + Arrays.toString(copied));
         */

         /* 98.2 TESTING */
        int[] original = { 1, 2, 3, 4 };
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));

    }

}
