package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 10; i >= 0; i--) {
            list.add(i  );
        }
        System.out.println(list);
        System.out.println("Minimum Element: " + Collections.min(list));
        System.out.println("Maximum Element: " + Collections.max(list));

        Collections.sort(list);

        System.out.println(list);


    }
}
