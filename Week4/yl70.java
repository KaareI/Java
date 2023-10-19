package Week4;
import java.util.ArrayList;

public class yl70 {

    public static ArrayList<Integer> combine(ArrayList<Integer> first, ArrayList<Integer> second) {

        first.addAll(second);
        return first;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);

        combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);

    }

}
