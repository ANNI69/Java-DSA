package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);        //End
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);


        list.add(2, 10);  //at specified index
        list.iterator().next();         //

        for (Integer integer : list) {
            System.out.println(integer * 2);
        }
    }
}
