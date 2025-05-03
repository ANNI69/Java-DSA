package Collection;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Insert
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        // Read
        for (String s : list) {
            System.out.println(s);
        }
        // Delete
        list.remove("D");
        for (String s : list) {
            System.out.println(s);
        }

        //Find
        boolean a = list.contains("A");
        System.out.println(a);

        // Size
        int i = Math.toIntExact(list.size());
        System.out.println(i);

        System.out.println(list.get(4));




    }
}
