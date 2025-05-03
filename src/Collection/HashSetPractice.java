package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set.add(1);
        set2.add(1);
        set.add(2);
        set2.add(2);
        set.add(3);
        set2.add(3);
//        set.add(4);
//        set.add(5);

        System.out.println(set2.equals(set));

    }
}
